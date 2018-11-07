package day0104;

import java.math.BigDecimal;
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
		//double d = 0.5*9.8*t*t;
		
		BigDecimal bd1 = BigDecimal.valueOf(4.9);
		BigDecimal bd2 = BigDecimal.valueOf(t);
		double d = 
				bd1
				.multiply(bd2.pow(2))
				.setScale(3, BigDecimal.ROUND_HALF_UP) //舍入运算
				.doubleValue();
		
		
		
		//打印结果
		System.out.println(t+"秒降落了"+d+"米");
	}
}




