package day0904;

public class Test2 {
	public static void main(String[] args) {
		String s0 = "abcdefghijklmnopqrstuvwxyz";
		String s = "";
		//系统时间毫秒值
		//从 1970-1-1 0点开始的毫秒值
		long t = System.currentTimeMillis();
		for(int i=0;i<100000;i++) {
			s += s0;
		}
		t = System.currentTimeMillis()-t;
		System.out.println(t);
	}
}
