package day0207;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.print("工资：");
		double s = 
		 new Scanner(System.in).nextDouble();
		
		//如果s不超过3500，不交税
		if(s <= 3500) {
			System.out.println("不用交税");
			//方法执行到此结束，后面代码不再执行
			return;
		}
		
		//工资s先刨掉3500
		s -= 3500; //s = s-3500
		
		//税率变量r和速算扣除数变量k
		double r=0;
		int k=0;
		
		//根据s的范围，来确定税率和速算扣除数
		if(s<=1500) {
			r=0.03;
			k=0;
		} else if(s<=4500) {
			r=0.1;
			k=105;
		} else if(s<=9000) {
			r=0.2;
			k=555;
		} else if(s<=35000) {
			r=0.25;
			k=1005;
		} else if(s<=55000) {
			r=0.3;
			k=2755;
		} else if(s<=80000) {
			r=0.35;
			k=5505;
		} else {
			r=0.45;
			k=13505;
		}
		
		double tax = s*r - k;
		System.out.println("个人所得税："+tax);   
	}
}



