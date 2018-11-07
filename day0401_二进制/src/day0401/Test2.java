package day0401;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		System.out.print("二进制数字：");
		String s = 
		 new Scanner(System.in).nextLine();
		
		/*
		 * Integer.parseInt("1010", 2)
		 * 以二进制，来解析数字字符串
		 */
		int a = Integer.parseInt(s, 2);
		System.out.println("十进制："+a);
	}
}




