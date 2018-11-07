package day1301;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		f1();
	}

	private static void f1() {
		/*
		 * 36.4363
		 * 3.63
		 * 
		 * 36.4363/3.63
		 */
		System.out.println("输入两个浮点数：");
		double a = new Scanner(System.in).nextDouble();  
		double b = new Scanner(System.in).nextDouble();  
		try {
			double r = divide(a, b);
			System.out.println(r);
		} catch (ArithmeticException e) {
			System.out.println(
				"不能除零，是我们的错，请鞭笞我们吧！");
			e.printStackTrace();//打印异常信息
		}
	}
	private static double divide(double a, double b) {
		if(b == 0) {
			ArithmeticException e = 
			 new ArithmeticException("/ by zero");
			throw e;
		}
		return a/b;
	}
}








