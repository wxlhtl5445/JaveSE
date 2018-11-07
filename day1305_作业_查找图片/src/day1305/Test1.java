package day1305;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("输入文件夹查找图片：");
		String s = new Scanner(System.in).nextLine();
		File dir = new File(s);
		if(! dir.isDirectory()) {
			System.out.println("输入的不是文件夹");
			return;
		}
		
		List<File> list = new ArrayList<>();
		findPic(dir, list);
		for (File f : list) {
			System.out.println(
					f.getAbsolutePath());
		}
	}

	private static void findPic(File dir, List<File> list) {
		//列表
		File[] files = dir.listFiles();
		if(files == null) {
			//列表列不出来，尝试删除目录
			return;
		}
		
		for (File f : files) {
			if(f.isFile()) {
				if(isPic(f)) {
					list.add(f);
				}
			} else {
				findPic(f, list);
			}
		}
	}

	private static boolean isPic(File f) {
		String n = f.getName().toLowerCase();
		if(n.matches(".+\\.(jpg|png|bmp|gif)")) {
			return true;
		}
		
		return false;
	}
}





