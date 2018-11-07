package day1302;

import java.io.File;
import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		System.out.println("输入文件夹：");
		String s = new Scanner(System.in).nextLine();
		File dir = new File(s);
		if(! dir.isDirectory()) {
			System.out.println("输入的不是文件夹");
			return;
		}
		
		/*
		 * 如果文件夹不存在，
		 * 或者文件夹没有权限进入
		 * 会得到 null 值
		 */
		String[] names = dir.list();
		File[] files = dir.listFiles();
		
		if(names == null) {
			System.out.println("无法获得列表");
			return;
		}
		
		for(String n : names) {
			System.out.println(n);
		}
		
		System.out.println("\n---------------\n");
		
		for(File f : files) {
			System.out.println(
			 f.getName()+" - "+f.length());
		}
		
	}
}





