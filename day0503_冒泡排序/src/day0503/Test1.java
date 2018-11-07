package day0503;

import java.util.Arrays;
import java.util.Random;

public class Test1 {
	public static void main(String[] args) {
		//产生一个随机乱序数组
		int[] a = suiJi();
		System.out.println(Arrays.toString(a));
		System.out.println("-------------");
		
		sort(a); //对数组a排序
		
		System.out.println("-------------");
		System.out.println(Arrays.toString(a));
	}

	private static int[] suiJi() {
		//产生一个随机整数值存到变量n
		//范围 5 + [0, 6)
		int n = 5+ new Random().nextInt(6);
		//新建 int[] 数组，长度 n
		//地址存到变量 a
		int[] a = new int[n];
		//遍历填入100内随机整数
		for(int i=0;i<a.length;i++) {
			a[i] = new Random().nextInt(100);
		}
		//返回数组 a
		return a;
	}

	private static void sort(int[] a) {
		/*
		 *                       j
		 * [14, 20, 37, 69, 53, 51]
		 *              i
		 * 
		 * j循环从后向前递减，把较小值向前交换，
		 * 直到把最小值推到i位置为止
		 * 
		 *                 
		 * [3, 12, 15, 32, 52, 52, 65]
		 *             i
		 * 
		 *          j循环开始之前
		 *          boolean flag = false 没有交换
		 *                  //falg = true  交换了数据
		 * 
		 *          if(!flag) {
		 *          	break;
		 *          }
		 * 
		 */
		for(int i=0;i<a.length;i++) {
			boolean flag = false;//没有交换			
			//j循环把最小值推到i位置
			for(int j=a.length-1; j>i; j--) {
				if(a[j]<a[j-1]) {
					int t = a[j];
					a[j] = a[j-1];
					a[j-1] = t;
					flag = true;
				}
			}
			//flag是false,没有交换数据，所有数据位置都正确
			if(!flag) {
				break;
			}
			
			System.out.println(Arrays.toString(a));  
		}
	}
}





