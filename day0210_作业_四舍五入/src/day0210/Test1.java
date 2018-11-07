package day0210;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.print("¸¡µãÊý£º");
		double d = new Scanner(System.in).nextDouble();
		f(d);
	}
	
	static void f(double d) {
		// 34.45697456
		d *= 1000; //34456.97456
		long n = (long) d; //34456
		int y = (int)(n%10); //6
		if(y>=5) {
			n = n+10-y; //34460
		} else {
			n -= y; //34450
		}
		d = n/1000d;
		System.out.println(d);
	}
}





