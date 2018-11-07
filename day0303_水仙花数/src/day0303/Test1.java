package day0303;

public class Test1 {
	public static void main(String[] args) {
		//i从100到<1000
		for(int i=100; i<1000; i++) {
			/*
			 * i = 456
			 * i%10  6
			 * i/10%10  5
			 * i/100  4
			 */
			int a = i%10;//个位
			int b = i/10%10;//十位
			int c = i/100;//百位
			//如果三个数的三次方相加，
			//和原值相等
			if(a*a*a+b*b*b+c*c*c == i) {
				System.out.println(i);
			}
		}
	}
}
