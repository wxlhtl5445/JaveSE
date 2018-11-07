package day0502;

import java.util.Arrays;
import java.util.Random;

public class Test1 {
	public static void main(String[] args) {
		//准备红球号码数组和蓝球号码数组
		int[] r = zbsz(33);
		int[] b = zbsz(16);
		System.out.println(Arrays.toString(r));
		System.out.println(Arrays.toString(b));
		
		//从数组r选择6个号码
		int[] red = xuanRed(r);
		//从数组b选择1个号码
		int blue = xuanBlue(b);
		
		System.out.println(Arrays.toString(red));
		System.out.println(blue);
	}
	
	private static int xuanBlue(int[] b) {
		return b[new Random().nextInt(16)];
	}

	private static int[] xuanRed(int[] r) {
		/*
		 *           t = 2
		 * 
		 *                         j        j                                                          
		 * [4,7,3,10,1,14,11,8,9,5,2,12,13,6,15,16,17...33]
		 *                i
		 * [4,7,3,10,1,14]
		 */
		//i循环从0到<6
		for(int i=0; i<6; i++) {
			//j随机定位，范围[0, 33)
			int j = new Random().nextInt(33);
			//r[i]和r[j]交换
			int t = r[i];
			r[i] = r[j];
			r[j] = t;
		}
		//截取r数组的前6个位置，
		//生成一个新数组
		return Arrays.copyOf(r, 6);
		
	}



	static int[] zbsz(int n) {
		//新建int[]数组，长度 n
		//地址存到变量 a
		int[] a = new int[n];
		
		//遍历数组a
		//顺序存入 1,2,3,4...
		for(int i=0;i<a.length;i++) {
			a[i] = i+1;
		}
		
		return a;
	}
}




