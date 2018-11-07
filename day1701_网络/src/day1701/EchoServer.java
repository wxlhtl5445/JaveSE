package day1701;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
	public void start() {
		//启动服务线程
		new Thread() {
			@Override
			public void run() {
				try {
					//启动服务
					ServerSocket ss = 
					 new ServerSocket(8000);
					System.out.println("服务已启动");    
					
					while(true) {
						Socket s = ss.accept();
						//把Socket连接通道交给通信线程去执行通信操作
						TongXinThread t = new TongXinThread(s); 
						t.start();
					}
				} catch (Exception e) {
					System.out.println(
						"服务无法启动，或服务已停止");
					e.printStackTrace();
				}
			}
		}.start();
	}
	
	
	class TongXinThread extends Thread {
		Socket s;
		public TongXinThread(Socket s) {
			this.s = s;
		}
		
		@Override
		public void run() {
			try {
				/*
				 * 通信协议
				 *     *) 通信执行流程
				 *        循环从客户端接收数据，
				 *        收到的数据，再发回客户端
				 *        
				 *     *) 数据格式
				 *        UTF-8编码的字符串
				 *        每一行行尾，要有一个换行符
				 * 
				 * BR--ISR--网络输入流
				 * PW--OSW--网络输出流
				 */
				BufferedReader in = 
				 new BufferedReader(
				 new InputStreamReader(
				 s.getInputStream(),"UTF-8"));
				
				PrintWriter out = 
				 new PrintWriter(
				 new OutputStreamWriter(
				 s.getOutputStream(),"UTF-8"));
				
				String line;
				while((line = in.readLine()) != null) {
					out.println(line);
					out.flush();
				}
				//断开
			} catch (Exception e) {
				//断开
			}
			
			System.out.println("客户端断开连接");
		}
		
	}
	
	
	public static void main(String[] args) {
		EchoServer s = new EchoServer();
		s.start();
	}
	
}





