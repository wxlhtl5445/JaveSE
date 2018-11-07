package day1601;

public class Test8 {
	public static void main(String[] args) {
		Stack stack = new Stack();
		Producer p = new Producer(stack);
		Consumer c = new Consumer(stack);
		p.start();
		c.start();
	}
}
