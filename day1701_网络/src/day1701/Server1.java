package day1701;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server1 {
	public static void main(String[] args) throws Exception {
		//选择一个端口，启动服务
		//端口如果被其他程序占用，会出错
		ServerSocket ss = new ServerSocket(8000);
		System.out.println("服务已启动");
		
		//等待客户端发起连接，并建立连接通道
		Socket s = ss.accept();
		
		//从连接通道，获得双向的流
		InputStream in = s.getInputStream();
		OutputStream out = s.getOutputStream();
		
		/*
		 * 通信协议
		 *     *)通信步骤
		 *     		1.接收数据
		 *     		2.发送数据
		 *     *)通信数据格式
		 *     		1.接收Hello五个英文字符
		 *     		2.发送world五个英文字符
		 */
		for(int i=0;i<5;i++) {
			char c = (char) in.read();
			System.out.print(c);
		}
		System.out.println("\n\n---------------");
		
		out.write("world".getBytes());
		out.flush();
		
		s.close();//断开连接
		ss.close();//停止服务，释放端口
	}
}








