package day1203;

import java.util.HashMap;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		System.out.println("输入字符串：");
		String s = new Scanner(System.in).nextLine();
		
		//新建HashMap<Character, Integer>对象
		//存到变量 map
		HashMap<Character, Integer> map = new HashMap<>();        
		//i循环遍历字符串s
		for(int i=0;i<s.length();i++) {
			//取出s中i位置的字符，存到c
			char c = s.charAt(i);
			//从map取出c对应的计数，存到Integer变量count
			Integer count = map.get(c);
			//如果count是null
			if(count == null) {
				//在map中放入c对应计数1
				map.put(c, 1);
			} else {
				//在map中放入c对应计数count+1
				map.put(c, count+1);
			}
		}
		//循环结束后，打印map
		System.out.println(map);
	}
}







