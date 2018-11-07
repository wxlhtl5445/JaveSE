package day0304;

public class Test1 {
	public static void main(String[] args) {
		//鸡的数量j从0到<=35
		//兔的数量t从35到>=0
		for(int j=0,t=35; j<=35; j++,t--) {
			//如果脚是94只
			if(j*2 + t*4 == 94) {
				System.out.println(
				 j+"只鸡，"+t+"只兔");
			}
		}
	}
}
