package day0410;

import java.util.Arrays;

public class Test1 {
	public static void main(String[] args) {
		//新建int[]数组，长度5
		//再把它的内存地址，存到变量a
		int[] a = new int[5];
		//Arrays.toString(a)
		//把数组中的值，连接成字符串
		System.out.println(Arrays.toString(a));
		
		char[] b = {'a','b','c','d'};
		System.out.println(Arrays.toString(b));
		
		b = new char[]{'x','y','z'};
		System.out.println(Arrays.toString(b));    
	}
}




