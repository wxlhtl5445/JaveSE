package day0206;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.print("输入原价：");
		double p = 
		 new Scanner(System.in).nextDouble();
		
		//折扣变量r，默认值 1
		double r = 1;
		
		//根据原价p的值，给r赋值
		if(p>=5000) {
			r=0.7;
		} else if(p>=2000) {
			r=0.8;
		} else if(p>=1000) {
			r=0.85;
		} else if(p>=500) {
			r=0.9;
		}
		
		p *= r; //p = p*r;
		System.out.println("实际价格："+p);
	}
}





