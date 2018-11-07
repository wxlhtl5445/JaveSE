package day0405;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.print("整数a:");
		int a = new Scanner(System.in).nextInt();
		System.out.print("整数b:");
		int b = new Scanner(System.in).nextInt();
		
		/*
		 * a和b的值，传递到f1()方法
		 * 再得到方法的返回值，存到变量zdgys
		 * 
		 * a和b的值，传递到f2()方法
		 * 再得到方法的返回值，存到变量zxgbs
		 */
		int zdgys = f1(a, b);
		long zxgbs = f2(a, b);
		System.out.println("最大公约数："+zdgys);
		System.out.println("最小公倍数："+zxgbs);
	}
	
	static int f1(int a, int b) {
		//求a,b最小值
		int min = a<b?a:b;
		//从min向前，找能把a,b同时整除的值
		for(int i=min; i>=1; i--) {
			if(a%i==0 && b%i==0) {
				return i;
			}
		}
		//逻辑上不可能执行，目的是让编译可以通过
		return 1;
	}
	
	static long f2(int a, int b) {
		//得到a,b的最大值
		int max = a>b? a:b;
		//从max开始，找能被a,b同时整除的值
		for(long i=max; ;i+=max) {
			if(i%a==0 && i%b==0) {
				return i;
			}
		}
	}
	
}








