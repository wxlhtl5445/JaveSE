package day0302;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.print("输入整数");
		int n = new Scanner(System.in).nextInt();
		f(n);
	}
	
	static void f(int x) {
		/*
		 * x的约数
		 * 
		 * *)i循环从1到<=x
		 *     *)如果x能被i整除
		 *         *)打印i的值
		 */
		for(int i=1; i<=x; i++) {
			if(x%i == 0) {
				System.out.println(i);
			}
		}
	}
	
}







