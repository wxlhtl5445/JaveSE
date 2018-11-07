package day1105;

import java.util.ArrayList;
import java.util.Iterator;

public class Test1 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(999);
		list.add(555);
		list.add(111);
		list.add(777);
		list.add(999);
		list.add(999);
		System.out.println(list.size());
		System.out.println(list);
		System.out.println(list.get(0));
		System.out.println(list.get(3));
		System.out.println(list.remove(3));
		System.out.println(list);
		System.out.println(list.remove(Integer.valueOf(999)));                         
		System.out.println(list);
		//下标遍历
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		//迭代器遍历，自己写
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			Integer i = it.next();
			System.out.println(i);
		}
	}
}



