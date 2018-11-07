package day0904;

public class Test1 {
	public static void main(String[] args) {
		char[] a = {'a', 'b', 'c'};
		String s1 = new String(a);//新分配内存

		String s2 = "abc";//常量池新建
		String s3 = "abc";//访问常量池同一个对象
		
		System.out.println(s1 == s2);
		System.out.println(s2 == s3);
		System.out.println(s1.equals(s2));
		
	}
}
