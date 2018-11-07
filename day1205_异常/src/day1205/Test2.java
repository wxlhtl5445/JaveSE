package day1205;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		try {
			f1();
		} catch (ParseException e) {
			System.out.println("日期格式错误");
			//打印完整的异常信息
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("目录不存在");
			e.printStackTrace();
		}
	}

	private static void f1() throws ParseException,IOException {
		/*
		 * 生日：1998-12-3
		 * --> Date --> 毫秒6234234523235
		 * 
		 * "d:\6234234523235.txt"
		 */
		System.out.print("生日(yyyy-MM-dd)：");
		String s = new Scanner(System.in).nextLine();
		SimpleDateFormat sdf = 
			new SimpleDateFormat("yyyy-MM-dd");
		Date d = sdf.parse(s);
		String path = "d:\\"+d.getTime()+".txt";
		File f = new File(path);
		f.createNewFile();//在磁盘新建文件
	}
}	







