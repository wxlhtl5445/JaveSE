package day0301;

public class Test4 {
	public static void main(String[] args) {
		// 产生随机浮点数 [0, 1)
		//double d = Math.random();
		//System.out.println(d);
		
		// >0.999
		for(int i=1; ;i++) {
			double d = Math.random();
			if(d>0.999) {
				System.out.println(
						"第"+i+"次: "+d);
				break;
			}
		}
	}
}




