package day1101;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test1 {
	public static void main(String[] args) {
		Date a = new Date();
		Date b = new Date(900000000000L);
		//println(Object)
		System.out.println(a);
		System.out.println(b);
		System.out.println(a.getTime());
		System.out.println(b.getTime());
		a.setTime(0L);
		System.out.println(a);
		
		System.out.println(a.compareTo(b));
		System.out.println(b.compareTo(a));     
		
		System.out.println("\n----------");
		SimpleDateFormat sdf = 
		 new SimpleDateFormat(
		 "yyyy-MM-dd HH:mm:ss");
		
		String s1 = sdf.format(a);
		String s2 = sdf.format(b);
		System.out.println(s1);
		System.out.println(s2);
	}
}



