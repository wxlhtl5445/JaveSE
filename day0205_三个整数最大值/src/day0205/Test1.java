package day0205;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.print("整数a:");
		int a = new Scanner(System.in).nextInt();
		System.out.print("整数b:");
		int b = new Scanner(System.in).nextInt();
		System.out.print("整数c:");
		int c = new Scanner(System.in).nextInt();
		
		//a,b的最大值，存到max
		//int max = a>b ? a : b;
		//max,c的最大值，存到max
		//max = max>c ? max : c;
		
		int max = a>b? (a>c?a:c) : (b>c?b:c);
		
		System.out.println("最大值："+max);
	}
}
