package day1303;

import java.io.File;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("文件夹：");
		String s = new Scanner(System.in).nextLine();
		File dir = new File(s);
		if(! dir.isDirectory()) {
			System.out.println("输入的不是文件夹");
			return;
		}
		
		long size = dirLength(dir);
		System.out.println(size);
	}

	private static long dirLength(File dir) {
		File[] files = dir.listFiles();
		if(files == null) {
			return 0;
		}
		long sum = 0;//累加变量
		for (File f : files) {
			if(f.isFile()) {//f是文件
				sum += f.length();
			} else {//f是文件夹
				//递归求f文件夹大小
				sum += dirLength(f);
			}
		}
		return sum;
	}
}








