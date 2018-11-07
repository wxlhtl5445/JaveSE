package day1505;

public class Test1 {
	public static void main(String[] args) {
		MyList list = new MyList();
		list.add(888);
		list.add(444);
		list.add(777);
		list.add(111);
		list.add(999);
		list.add(333);
		list.add(777);
		list.add(222);
		list.add(666);
		System.out.println(list.size());
		System.out.println(list.get(3));
		System.out.println(list.get(8));
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}
}
