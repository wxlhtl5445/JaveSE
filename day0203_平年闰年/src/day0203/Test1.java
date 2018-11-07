package day0203;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.print("输入年号：");
		//先获得输入的值
		//再存到变量 y
		int y = new Scanner(System.in).nextInt();
		
		//定义字符串变量r，赋默认值"平年"
		String r = "平年";
		
		//判断y年号如果是闰年，修改变量r，改成"闰年"
		
		//如果y能被4整除
		/*if(y%4 == 0) {
			//能被4整除的情况下
			//进一步判断不能被100整除
			if(y%100 != 0) {
				r = "闰年";
			}
		}
		//如果y能被400整除
		if(y%400 == 0) {
			r = "闰年";
		}*/
		
		
		if((y%4==0 && y%100!=0) || y%400==0) {
			r = "闰年";
		}
		
		System.out.println(y+"年是"+r);
	}
}







