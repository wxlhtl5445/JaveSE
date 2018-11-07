package day0406;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.print("年:");
		int y = new Scanner(System.in).nextInt();
		System.out.print("月:");
		int m = new Scanner(System.in).nextInt();

		if (m < 1 || m > 12) {
			System.out.println("错误的月份");
			return;// 方法到此结束
		}

		/*
		 * y,m传到 f() 方法求天数 再得到方法的返回值，存到变量 r
		 */
		int r = f(y, m);
		System.out.println(y + "年" + m + "月有" + r + "天");
	}

	static int f(int y, int m) {
		// 定义变量r用来保存结果
		int r = 0;
		switch (m) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			r = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			r = 30;
			break;
		case 2:
			if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) {
				r = 29;
			} else {
				r = 28;
			}
		}
		return r;
	}
}
