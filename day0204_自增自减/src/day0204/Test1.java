package day0204;

public class Test1 {
	public static void main(String[] args) {
		int a;
		
		a = 5;
		System.out.println(a++);
		System.out.println(a);
		
		System.out.println("------------");
		
		a = 5;
		System.out.println(++a);
		System.out.println(a);
		
		System.out.println("------------");
		
		a = 5;
		int b = a++;
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("------------");
		
		a = 5;
		/*
		 * 1. 取a的原值5，等待赋值
		 * 2. a自增变成6
		 * 3. 把第1步取出的值5，重新保存到a
		 */
		a = a++;
		System.out.println(a);
	}
}




