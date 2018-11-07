package day0102;

public class Test1 {
	public static void main(String[] args) {
		//定义八个变量 abcdefgh，
		//保存四种整数的最小值和最大值
		byte a = -128;
		byte b = 127;
		/*
		 * jdk类库中的Short类，
		 * Short类中定义的
		 * 常量 MIN_VALUE中保存着short最小值
		 */
		short c = Short.MIN_VALUE;
		short d = Short.MAX_VALUE;
		
		int e = Integer.MIN_VALUE;
		int f = Integer.MAX_VALUE;
		
		long g = Long.MIN_VALUE;
		long h = Long.MAX_VALUE;
		
		//四个变量 ijkl
		//来保存float和double的最小值最大值
		float i = Float.MIN_VALUE;
		float j = Float.MAX_VALUE;
		
		double k = Double.MIN_VALUE;
		double l = Double.MAX_VALUE;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);
	}
}


