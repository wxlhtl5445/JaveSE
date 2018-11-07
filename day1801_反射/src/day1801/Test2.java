package day1801;

import java.lang.reflect.Constructor;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) throws Exception {
		System.out.println("输入类名：");
		String s = new Scanner(System.in).nextLine();
		
		Class<?> c = Class.forName(s);
		
		//分别执行无参和有参构造创建对象
		System.out.println("\n\n--无参构造-------------");
		f1(c);
		
		System.out.println("\n\n--int参数构造-------------");
		f2(c);
		
	}

	private static void f1(Class<?> c) {
		try {
			//执行无参构造，
			//如果没有无参构造，会出现异常
			Object obj = c.newInstance();
			System.out.println(obj);
		} catch (Exception e) {
			System.out.println("无法执行无参构造方法");
		}
	}

	private static void f2(Class<?> c) {
		try {
			//获得接收 int 参数的构造方法
			//如果不存在，会出现异常
			Constructor<?> t = 
			 c.getConstructor(int.class);
			
			//新建实例，并执行这个构造方法
			Object obj = t.newInstance(55);
			System.out.println(obj);
			
		} catch (Exception e) {
			System.out.println(
			 "无法执行int参数构造方法");
		}		
		
		/*
		 * java.lang.Integer
		 * java.util.Date
		 * java.util.ArrayList
		 * day1801.Student
		 */
	}
}







