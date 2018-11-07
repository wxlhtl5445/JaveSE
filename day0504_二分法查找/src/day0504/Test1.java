package day0504;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		//随机产生一个乱序数组
		int[] a = suiJi();
		//对数组a排序
		//基本类型数组，采用优化的快速排序算法
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		System.out.print("查找的目标值：");
		int t = new Scanner(System.in).nextInt();
		
		//在有序数组a中，查找目标值t的位置
		//如果找不到，返回负数无意义值
		int index = binarySearch(a, t);
		
		if(index >= 0) {
			System.out.println("下标位置："+index);
		} else {
			System.out.println("目标值不存在");
		}
	}

	private static int[] suiJi() {
		//产生一个5+ [0,6)范围的随机整数
		//存到变量 n
		int n = 5+ new Random().nextInt(6);
		
		//新建int[]数组，长度n
		//存到变量a
		int[] a = new int[n];
		
		//遍历数组，存入100内随机整数
		for(int i=0;i<a.length;i++) {
			a[i] = new Random().nextInt(100);
		}
		
		//返回数组a
		return a;
	}
	
	private static int binarySearch(int[] a, int t) {
		/*
		 * t = 70
		 * a
		 *                  mid
		 * [23, 55, 64, 69, 70, 71, 75, 89, 92]
		 *  lo
		 *                                  hi
		 * *)定义三个下标变量
		 *   lo=0
		 *   hi=a.length-1
		 *   mid;
		 * *)当lo<=hi
		 *     *)mid=(lo+hi)/2
		 *     *)mid位置值比t大，hi移到mid-1位置
		 *     *)否则如果mid位置值比t小，lo移到mid+1位置          
		 *     *)否则，返回 mid 下标值
		 * 
		 * *)返回-1，无意义值，表示找不到
		 */
		
		int lo = 0;
		int hi = a.length-1;
		int mid;
		while(lo<=hi) {
			mid = (lo+hi)/2;
			if(a[mid]>t) {
				hi=mid-1;
			} else if(a[mid]<t) {
				lo=mid+1;
			} else {
				return mid;
			}
		}
		return -1;		
	}
}













