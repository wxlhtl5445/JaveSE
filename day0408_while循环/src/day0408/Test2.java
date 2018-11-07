package day0408;

public class Test2 {
	public static void main(String[] args) {
		// >0.999
		int i=0;
		double d=0;
		
		do {
			d = Math.random();
			i++;
		} while(d<=0.999);
		
		System.out.println("µÚ"+i+"´Î£º"+d);
	}
}
