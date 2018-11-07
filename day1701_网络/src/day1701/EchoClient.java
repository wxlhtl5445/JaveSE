package day1701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class EchoClient {
	public static void main(String[] args) throws Exception {
		Socket s =
		 new Socket("xx.xxx.xx.xxx", 8000);
		
		/*
		 * BR--ISR--网络输入流, UTF-8
		 * PW--OSW--网络输出流, UTF-8
		 */
		BufferedReader in = 
		 new BufferedReader(
		 new InputStreamReader(
		 s.getInputStream(),"UTF-8"));
		
		PrintWriter out = 
		 new PrintWriter(
		 new OutputStreamWriter(
		 s.getOutputStream(),"UTF-8"));
		
		while(true) {
			System.out.print("输入：");
			String str = new Scanner(System.in).nextLine();
			out.println(str);
			out.flush();
			System.out.println("内容已发送至服务器");
			
			str = in.readLine();
			System.out.println("收到服务器回信："+str);
		}
		
	}
}





