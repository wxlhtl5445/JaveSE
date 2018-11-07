package day1102;

import java.util.Iterator;
import java.util.LinkedList;

public class Test1 {
	public static void main(String[] args) {
		/*
		 * <> 泛型
		 *    限制集合中存放的数据类型
		 *    泛型不支持基本类型
		 */
		LinkedList<String> list = 
				new LinkedList<>();
		list.add("aaa");
		list.add("www");
		list.add("uuu");
		list.add("kkk");
		list.add("fff");
		list.add("aaa");
		list.add("aaa");
		System.out.println(list.size());
		System.out.println(list);
		System.out.println(list.get(0));
		System.out.println(list.get(list.size()-1));
		System.out.println(list.remove(2));
		System.out.println(list);
		System.out.println(list.remove("aaa"));
		System.out.println(list);
		System.out.println(list.remove("xxx"));
		System.out.println(list);
		//双向链表，下标遍历效率低
		for(int i=0;i<list.size();i++) {
			String s = list.get(i);
			System.out.println(s);
		}
		System.out.println("\n----------------");
		//迭代器遍历
		//新建迭代器对象
		Iterator<String> it = list.iterator();   
		//当还有数据
		while(it.hasNext()) {
			//取下一项
			String s = it.next();
			System.out.println(s);
		}
	}
}








