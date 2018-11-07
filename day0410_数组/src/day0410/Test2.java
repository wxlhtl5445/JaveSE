package day0410;

import java.util.Arrays;

public class Test2 {
	public static void main(String[] args) {
		//新建int[]数组，长度10
		//再把地址存到变量a
		int[] a = new int[10];
		
		//遍历数组，存入1,2,3...10
		for(int i=0; i<a.length; i++) {
			a[i] = i+1;
			System.out.println(Arrays.toString(a));
		}
	}
}
