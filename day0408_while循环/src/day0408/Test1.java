package day0408;

public class Test1 {
	public static void main(String[] args) {
		// >0.999
		int i=0;//计次
		double d=0;//保存结果
		
		while(d<=0.999) {
			d=Math.random();
			i++;
		}
		
		System.out.println("第"+i+"次："+d);
	}
}
