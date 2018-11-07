package day1001;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		/*
		 * 判断输入的字符串是否是“回文”
		 * 正反相同
		 * abcdedcba
		 */
		System.out.println("输入字符串：");
		String s = new Scanner(System.in).nextLine();
		if(huiWen(s)) {
			System.out.println("是回文");
		} else {
			System.out.println("不是回文");
		}
	}

	private static boolean huiWen(String s) {
		/*
		 * abxddcba
		 *   i  j
		 */
		//i从0递增，j从末尾递减
			//如果i位置字符与j位置字符不相等
				//返回false
		
		//循环结束，返回true
		
		for(int i=0,j=s.length()-1; i<j; i++,j--) {
			if(s.charAt(i) != s.charAt(j)) {
				return false;
			}
		}
		
		return true;
	}
}





