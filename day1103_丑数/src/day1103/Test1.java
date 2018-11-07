package day1103;

import java.util.LinkedList;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.print("求第几个丑数：");
		int n = new Scanner(System.in).nextInt();
		long r = f(n);
		System.out.println(r);
	}

	private static long f(int n) {
		/*
		 * 8  10  12  xx
		 * -------------------
		 * 9  12  15  18  xx
		 * -------------------
		 * 10  15  20  25  30  xx
		 * -------------------
		 * 
		 *    2  3  4  5  6  
		 * 1. 取最小值
		 * 2. 最小值乘2,3,5放入集合
		 */
		LinkedList<Long> list2 = new LinkedList<>();
		LinkedList<Long> list3 = new LinkedList<>();
		LinkedList<Long> list5 = new LinkedList<>(); 
		list2.add(2L);
		list3.add(3L);
		list5.add(5L);
		long r = 0;//保存取出的结果
		for(int i=1; i<=n; i++) {
			//取最小值
			long a = list2.getFirst();
			long b = list3.getFirst();
			long c = list5.getFirst();
			r = Math.min(a, Math.min(b, c));
			if(r==a) list2.removeFirst();
			if(r==b) list3.removeFirst();
			if(r==c) list5.removeFirst();
			//*2,3,5放入集合
			list2.add(r*2);
			list3.add(r*3);
			list5.add(r*5);
		}		
		return r;
	}
}





