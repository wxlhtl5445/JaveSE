package day1001;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		/*
		 * 输入email地址，提取名字部分
		 * "abc@def.com"
		 *  abc
		 */
		System.out.println("email:");
		String e = new Scanner(System.in).nextLine();
		String name = getName(e);
		System.out.println(name);
	}

	private static String getName(String e) {
		//参数e字符串中去除两端空白字符，再存到变量e
		e = e.trim();
		//在e中查找子串 "@"，位置下标存到 index
		int index = e.indexOf("@");
		//如果 "@" 不存在，返回 "格式错误"
		if(index == -1) {
			return "格式错误";
		}
		//从 e 截取 [0, index) 子串
		String n = e.substring(0, index);
		//返回截取的子串
		return n;
	}
}





