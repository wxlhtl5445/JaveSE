package day0307;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.print("输入质数：");
		int n = new Scanner(System.in).nextInt();
		
		f(n);
	}
	
	static void f(int n) {
		if(n==2) {
			System.out.println("是质数");
			return;
		}
		if(n<2) {
			System.out.println("不是质数");
			return;
		}
		
		/*
		 * n是否是质数
		 * 
		 * 从2到<n开方+1，找能把n整除的值，
		 * 找到，n不是质数
		 * 找完所有的值，找不到，n是质数
		 */
		
		//n开方+1，存到变量max
		double max = Math.sqrt(n) + 1;
		
		//用一个标记，假设是质数
		boolean flag = true;		
		//2到<max
		for(int i=2; i<max; i++) {
			//n被i整除
			if(n%i == 0) {
				System.out.println("不是质数");
				flag = false;//不是质数
				break;
			}
		}
		//如果flag变量的值是true
		if(flag) {
			System.out.println("是质数");
		}
	}
}






