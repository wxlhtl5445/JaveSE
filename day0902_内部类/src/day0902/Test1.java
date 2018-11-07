package day0902;

import day0902.A.Inner1;
import day0902.A.Inner2;

public class Test1 {
	public static void main(String[] args) {
		Inner1 i1 = new Inner1();
		System.out.println(i1);
		System.out.println("\n----------");
		
		A a = new A();
		Inner2 i2 = a.new Inner2();
		System.out.println(i2);
	}
}

class A {
	static class Inner1 {
	}
	class Inner2 {
	}
}