package day0208;

public class Test2 {
	public static void main(String[] args) {
		System.out.println(1);
		f(2);
		System.out.println(3);
		f(4);
		System.out.println(5);
		f(6);
	}
	
	static void f(int a) {
		System.out.println("收到参数："+a);
	}
}








