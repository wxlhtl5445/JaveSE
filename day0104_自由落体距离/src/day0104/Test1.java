package day0104;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.print("输入降落时间（秒）：");
		/*
		 * 先获得输入的值
		 * 再存到变量t
		 */
		double t = 
		 new Scanner(System.in).nextDouble();
		
		//套公式求出距离
		//再把计算结果，存到变量d
		double d = 0.5*9.8*t*t;
		
		//打印结果
		System.out.println(t+"秒降落了"+d+"米");
	}
}




