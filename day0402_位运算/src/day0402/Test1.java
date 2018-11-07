package day0402;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		/*
		 * 10进制值，转成2进制字符串
		 * Integer.toBinaryString()
		 * 
		 * 45646 --> "10101111000111"
		 * 
		 * 10101111000111
		 *       i
		 * 
		 * 00000000000001
		 * 00000010000000 t
		 * 00000010000000
		 */
		
		System.out.print("输入整数：");
		int a = new Scanner(System.in).nextInt();
		
		String r = "";
		
		//从第1位，到第32位，处理每一位
		for(int i=0; i<32; i++) {
			int t = 1<<i;
			t = t&a;
			if(t==0) {
				r = 0+r;
			} else {
				r = 1+r;
			}
		}
		
		System.out.println(r);
		
	}
}







