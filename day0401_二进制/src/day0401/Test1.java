package day0401;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.print("输入整数：");
		int a = new Scanner(System.in).nextInt();
		
		/*
		 * Integer.toBinaryString(int)
		 * 把int整数，转成二进制数字字符串
		 */
		String s = Integer.toBinaryString(a);
		System.out.println("二进制："+s);
		
		s = Integer.toHexString(a);
		System.out.println("十六进制："+s);
	}
}



