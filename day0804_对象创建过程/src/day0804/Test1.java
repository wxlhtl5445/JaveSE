package day0804;

public class Test1 {
	public static void main(String[] args) {
		new B();
		System.out.println("\n----------\n");
		new B();
	}
}

class A {
	int v1 = 1;
	static int v2 = 2;
	static {
		System.out.println("A静态块");
	}

	public A() {
		System.out.println("A构造");
	}
}

class B extends A {
	int v3 = 3;
	static int v4 = 4;
	static {
		System.out.println("B静态块");
	}

	public B() {
		System.out.println("B构造");
	}
}
