package day1702;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.LinkedList;
import java.util.Scanner;

public class ChatClient {
	private Socket s;
	private BufferedReader in;
	private PrintWriter out;
	
	private LinkedList<String> list = new LinkedList<>();
	private boolean inputFlag = false;
	
	
	public void start() {
		try {
			s = new Socket("192.168.14.100", 8000);
			in = 
			 new BufferedReader(
			 new InputStreamReader(
			 s.getInputStream(),"UTF-8"));
			
			out = 
			 new PrintWriter(
			 new OutputStreamWriter(
			 s.getOutputStream(),"UTF-8"));
			
			System.out.println("已经连接服务器");
			System.out.print("输入昵称：");
			String name = new Scanner(System.in).nextLine();
			out.println(name);
			out.flush();
			
			//输入聊天内容的线程
			new Thread() {
				@Override
				public void run() {
					input();
				}
			}.start();
			
			//接收服务器数据的线程
			new Thread() {
				@Override
				public void run() {
					receive();
				}
			}.start();
			
			//打印线程
			new Thread() {
				@Override
				public void run() {
					print();
				}
			}.start();
			
			
		} catch (Exception e) {
			System.out.println("无法连接服务器");
		}
	}

	protected void print() {
		while(true) {
			synchronized (list) {
				//没有数据，或者用户正在输入，
				//暂停等待
				while(list.size()==0 || inputFlag) {
					try {
						list.wait();
					} catch (InterruptedException e) {
					}
				}
				String str = list.removeFirst();
				System.out.println(str);
			}
		}
	}

	protected void receive() {
		try {
			String line;
			while((line = in.readLine()) != null) {
				synchronized (list) {
					list.add(line);
					list.notifyAll();
				}
			}
		} catch (Exception e) {
		}
		
		System.out.println("已经与服务器断开连接");
	}

	protected void input() {
		System.out.println("按回车输入聊天内容");
		
		while(true) {
			new Scanner(System.in).nextLine();
			inputFlag = true;			
			
			System.out.print("输入聊天内容：");
			String s = new Scanner(System.in).nextLine();
			out.println(s);
			out.flush();
			
			inputFlag = false;

			synchronized (list) {
				list.notifyAll();
			}
		}
	}
	
	
	public static void main(String[] args) {
		ChatClient c = new ChatClient();
		c.start();
	}
}







