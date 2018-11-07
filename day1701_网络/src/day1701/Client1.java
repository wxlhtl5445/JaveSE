package day1701;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client1 {
	public static void main(String[] args) throws Exception {
		//客户端Socket
		Socket s = 
		 new Socket("127.0.0.1", 8000);
		
		//取出双向的流
		InputStream in = s.getInputStream();
		OutputStream out = s.getOutputStream();
		
		/*
		 * 1. 发送Hello
		 * 2. 接收world
		 */
		
		System.out.println("向服务器发送Hello");
		out.write("Hello".getBytes());
		out.flush();
		System.out.println("发送完成！");
		System.out.println("\n\n---------------");
		
		System.out.println("从服务器接收");
		for(int i=0;i<5;i++) {
			char c = (char) in.read();
			System.out.print(c);
		}
		System.out.println("接收完毕！");
		
		s.close();//断开连接
		
		
	}
}






