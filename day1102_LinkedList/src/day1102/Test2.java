package day1102;

import java.util.Iterator;
import java.util.LinkedList;

public class Test2 {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		for(int i=0;i<100000;i++) {
			list.add(Integer.valueOf(1));
		}
		System.out.println("\n\n--下标遍历-----------");
		f1(list);

		System.out.println("\n\n--迭代遍历-----------");
		f2(list);
	}

	private static void f1(LinkedList<Integer> list) {
		long t = System.currentTimeMillis();

		for(int i=0;i<list.size();i++) {
			list.get(i);
		}

		t = System.currentTimeMillis()-t;
		System.out.println(t);
	}

	private static void f2(LinkedList<Integer> list) {
		long t = System.currentTimeMillis();

		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			it.next();
		}

		t = System.currentTimeMillis()-t;
		System.out.println(t);
	}
}



