package day1101;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) throws ParseException {
		System.out.println("生日(yyyy-MM-dd)：");
		String s = new Scanner(System.in).nextLine();
		//"1993-5-12"
		//解析成 Date 对象
		SimpleDateFormat sdf = 
		 new SimpleDateFormat("yyyy-MM-dd");		
		//用ctrl+1，选择 add throws ....
		Date d = sdf.parse(s);		
		long t = 
		System.currentTimeMillis()-d.getTime();
		
		t = t/1000/60/60/24;
		System.out.println("您已经生存了"+t+" 天");
	}
}












