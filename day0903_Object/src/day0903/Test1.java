package day0903;

public class Test1 {
	public static void main(String[] args) {
		Point a = new Point(3,4);
		Point b = new Point(3,4);
		
		//println(String)
		System.out.println(a.toString());
		System.out.println(b.toString());
		
		//println(Object)
		//得到对象后，会先调用对象的 toString()
		//再打印 toString()的结果字符串
		System.out.println(a);
		
		//比较变量中存的地址值
		System.out.println(a == b);
		
		System.out.println(a.equals(b));
		
		
	}
}



