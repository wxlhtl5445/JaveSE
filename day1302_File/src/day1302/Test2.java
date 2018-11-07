package day1302;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) throws Exception {
		/*
		 * 新建文件夹d:\abc\aa
		 * 
		 * 新建文件d:\abc\aa\a.txt
		 * 
		 * 删除文件d:\abc\aa\a.txt
		 * 
		 * 删除文件夹d:\abc\aa
		 */
		System.out.println("按回车执行");
		
		new Scanner(System.in).nextLine();
		File dir = new File("d:/abc/aa");
		dir.mkdirs();
		
		new Scanner(System.in).nextLine();
		File f = new File("d:/abc/aa/a.txt");
		f.createNewFile();
		
		new Scanner(System.in).nextLine();
		f.delete();
		
		new Scanner(System.in).nextLine();
		dir.delete();
		
		
	}
}


