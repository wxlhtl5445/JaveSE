package day1801;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Arrays;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) throws Exception {
		System.out.println("输入类名：");
		String s = new Scanner(System.in).nextLine();
		
		/*
		 * "java.lang.String"
		 * "java.util.ArrayList"
		 * "java.io.File"
		 * "day1801.Student"
		 */
		Class<?> c = Class.forName(s);
		
		System.out.println(c.getPackage().getName());
		System.out.println(c.getName());//完整类名
		System.out.println(c.getSimpleName());//不含包名
		
		System.out.println("\n\n--成员变量----------------");
		f1(c);
		
		System.out.println("\n\n--构造方法----------------");
		f2(c);
		
		System.out.println("\n\n--方法----------------");
		f3(c);
		
	}

	private static void f1(Class<?> c) {
		/*
		 * Field对象，封装一个成员变量的定义信息
		 * 
		 * private static final String d; 
		 */
		Field[] a = c.getDeclaredFields();
		for (Field f : a) {
			Class<?> type = f.getType();
			String name = f.getName();
			System.out.println(
			 type.getSimpleName()+" "+name);
		}
	}
	

	private static void f2(Class<?> c) {
		/*
		 * Constructor 封装构造方法的定义信息
		 * 
		 * public A(int,String) throws X,Y,Z
		 */
		Constructor<?>[] a = c.getDeclaredConstructors();		
		for (Constructor<?> t : a) {
			String n = c.getSimpleName();
			Parameter[] p = t.getParameters();
			System.out.println(
			 n+"("+Arrays.toString(p)+")");
		}
	}

	private static void f3(Class<?> c) {
		/*
		 * Method 封装一个方法的定义信息
		 * 
		 * public static final String f(int,String) throws X,Y,Z
		 */
		Method[] a = c.getDeclaredMethods();
		for (Method m : a) {
			String r = m.getReturnType().getSimpleName();
			String n = m.getName();
			Parameter[] p = m.getParameters();
			System.out.println(
			 r+" "+n+"("+Arrays.toString(p)+")");
		}
	}
}







