package day1505;

public class MyList {
	
	private Node head;
	private Node tail;
	private int size;
	
	public void add(Object value) {
		if(head == null) {//还没有数据
			head = new Node();
			head.value = value;
			tail = head;//既是头也是尾
			//自己前后都引用自己
			head.prev = head;
			head.next = head;
		} else {
			Node n = new Node();
			n.value = value;
			tail.next = n;
			n.prev = tail;
			head.prev = n;
			n.next = head;
			tail = n;
		}
		size++;
	}
	
	public Object get(int i) {
		//n从head开始
		Node n = head;
		int count = 0;
		//当count<i
		while(count<i) {
			n = n.next;
			count++;
		}
		return n.value;
	}
	
	public int size() {
		return size;
	}
	
	//节点类
	private class Node {
		Node prev;
		Node next;
		Object value;
	} 
}




