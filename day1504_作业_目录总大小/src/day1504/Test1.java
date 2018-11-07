package day1504;

import java.io.File;
import java.util.LinkedList;
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
		//新建LinkedList
		LinkedList<File> list = 
				new LinkedList<>();
		//dir添加到list
		list.add(dir);
		
		//文件大小累加变量 sum
		long sum = 0;
		
		//当集合不是空集合
		while(list.size() != 0) {
			File f = list.removeFirst();
			if(f.isFile()) {
				sum += f.length();
			} else {
				//f是文件夹，展开列表，全部加入list头部
				File[] files = f.listFiles();
				for (File f2 : files) {
					list.addFirst(f2);
				}
			}
		}
		return sum;
	}
}






