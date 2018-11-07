package day0404;

import java.math.BigInteger;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.print("输入整数，求阶乘：");
		int n = new Scanner(System.in).nextInt();
		
		/*
		 * 把n的值，传递到f()方法进行运算，
		 * 再得到方法的返回值，
		 * 保存到变量 r
		 */
		String r = f(n);
		System.out.println(r);
	}
	
	static String f(int n) {//5
		/*
		 * long r = 5
		 * 
		 * i循环
		 * 4, r=r*i
		 * 3, r=r*i
		 * 2, r=r*i
		 * 1, r=r*i
		 */
		
		//r从n开始
		//long r = n;
		//i从n-1到1递减
		//for(int i=n-1; i>=1; i--) {
		//	r *= i; //r=r*i;
		//}
		BigInteger r = BigInteger.valueOf(n);
		for(int i=n-1; i>=1; i--) {
			r=r.multiply(BigInteger.valueOf(i));
		}
		
		
		return r.toString();
	}
	
	
}




