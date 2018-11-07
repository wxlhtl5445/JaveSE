package day1506;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.print("原文件：");
		String s1 = new Scanner(System.in).nextLine();
		File from = new File(s1);
		if(! from.isFile()) {
			System.out.println("输入的不是文件");
			return;
		}
		
		System.out.println("目标文件：");
		String s2 = new Scanner(System.in).nextLine();
		File to = new File(s2);
		if(to.isDirectory()) {
			System.out.println(
			 "不能输入文件夹，请输入文件");
			return;
		}
		
		System.out.print("原文件编码：");
		String fromCharset = new Scanner(System.in).nextLine();
		System.out.print("目标文件编码：");
		String toCharset = new Scanner(System.in).nextLine();
		
		try {
			copy(from,to,fromCharset,toCharset);
			System.out.println("完成");
		} catch (Exception e) {
			System.out.println("失败");
			e.printStackTrace();
		}
		
	}

	private static void copy(
			File from, 
			File to,
			String fromCharset,
			String toCharset) throws Exception {
		InputStreamReader in = 
		 new InputStreamReader(
		 new FileInputStream(from), fromCharset);
		OutputStreamWriter out = 
		 new OutputStreamWriter(
		 new FileOutputStream(to), toCharset);
		
		char[] buff = new char[8192];
		int n;
		while((n=in.read(buff)) != -1) {
			out.write(buff,0,n);
		}
		in.close();
		out.close();
	}
}





