package day0209;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.print("输入百分制分数：");
		int s = new Scanner(System.in).nextInt();
		
		//调用f()方法，
		//把s的值传递到f()方法进行运算
		f(s);
	}
	
	static void f(int a) {
		//如果a范围有误
		if(a<0 || a>100) {
			System.out.println("百分之分数有误");
			//方法到此结束,返回到调用位置继续
			return;
		}
		
		//定义变量r，用来保存五档分制结果
		char r = 0;
		//根据百分制分数a，来确定r的值
		switch(a/10) {
		case 10:
		case 9:
			r = 'A';
			break;
		case 8:
		case 7:
			r = 'B';
			break;
		case 6:
			r = 'C';
			break;
		case 5:
		case 4:
		case 3:
		case 2:
			r = 'D';
			break;
		case 1:
		case 0:
			r = 'E';
			break;
		}
		
		System.out.println("五档分制："+r);
		
	}
	
}






