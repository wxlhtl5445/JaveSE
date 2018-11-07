package day1702;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.List;

public class ChatServer {
	private List<TongXinThread> list = 
			new ArrayList<>();
	
	public void start() {
		//启动服务线程
		new Thread() {
			@Override
			public void run() {
				try {
					ServerSocket ss = 
					 new ServerSocket(8000);
					System.out.println("聊天室服务器已启动");
					while(true) {
						Socket s = ss.accept();
						TongXinThread t = 
						 new TongXinThread(s);
						t.start();
						synchronized (list) {
							list.add(t);
						}
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
		BufferedReader in;
		PrintWriter out;
		String name;
		
		public TongXinThread(Socket s) {
			this.s = s;
		}
		
		public void send(String msg) {
			out.println(msg);
			out.flush();
		}
		
		public void sendAll(String msg) {
			synchronized (list) {
				for (TongXinThread t : list) {
					t.send(msg);
				}
			}
		}
		
		@Override
		public void run() {
			try {
				in = 
				 new BufferedReader(
				 new InputStreamReader(
				 s.getInputStream(),"UTF-8"));
				
				out = 
				 new PrintWriter(
				 new OutputStreamWriter(
				 s.getOutputStream(),"UTF-8"));       
				
				//先接收客户端的昵称
				name = in.readLine();
				//发送欢迎信息
				send(name+"，欢迎来到激情聊天室！");
				//群发上线信息
				synchronized (list) {
					sendAll(name+"进入了聊天室，在线人数："+list.size());   
				}
				
				s.setSoTimeout(3000);
				int count = 0;
				
				String line;
				while(true) {
					try {
						line = in.readLine();
						if(line == null) {
							break;
						}
						sendAll(name+"说："+line);
						count = 0;
					} catch (SocketTimeoutException e) {
						count++;
						if(count == 4) {
							send("*** 您已经被踢出聊天室");
							s.close();
							break;
						}
						send("*** 警告：请积极参与聊天 ("+count+"/3)");
					}
					
				}
			} catch (Exception e) {
			}
			synchronized (list) {
				//移除当前通信线程对象
				list.remove(this);
				//群发离线消息
				sendAll(name+"离开了聊天室，在线人数："+list.size());   
			}
		}
	}
	
	
	public static void main(String[] args) {
		ChatServer s = new ChatServer();
		s.start();
	}
	
	
}









