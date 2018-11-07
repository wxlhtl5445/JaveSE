package day0905;

import java.util.Arrays;

public class Test1 {
	public static void main(String[] args) {
		int[] a = {1, 2, 3};
		/*
		 *  start
		 *   |
		 *   1, 3, 2
		 *         i
		 *
		 *
		 *    start
		 *      |
		 *   2, 1, 3
		 *      i
		 */
		f(a, 0);
	}

	private static void f(int[] a, int start) {
		if(start == a.length-1) {
			System.out.println(Arrays.toString(a));
			return;
		}
		
		for(int i=start; i<a.length; i++) {
			//i位置值，固定在start位置
			swap(a, i, start);
			//递归对start之后的值全排列
			f(a, start+1);
			//i和start要交换回来，否则会引起混乱
			swap(a, i, start);
		}
	}

	private static void swap(int[] a, int i, int start) {
		int t = a[i];
		a[i] = a[start];
		a[start] = t;
	}
}





