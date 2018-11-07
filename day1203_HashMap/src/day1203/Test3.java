package day1203;

import java.util.HashMap;

public class Test3 {
	public static void main(String[] args) {
		Point a = new Point(1, 3.2);
		Point b = new Point(1, 3.2);
		
		//两个对象的哈希值必须相同，
		//才能保证计算出相同的位置
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		
		//即使哈希值相等，
		//equals()也必须相等才能覆盖
		//否则，链表连在一起
		System.out.println(a.equals(b));
		
		HashMap<Point, String> map = new HashMap<>();
		map.put(a, "3.25亿");
		map.put(b, "3.26亿");
		System.out.println(map);
	}
}








