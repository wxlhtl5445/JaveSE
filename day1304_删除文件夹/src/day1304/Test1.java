package day1304;

import java.io.File;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("输入要删除的文件夹（不可恢复）：");
		String s = new Scanner(System.in).nextLine();
		File dir = new File(s);
		if(! dir.isDirectory()) {
			System.out.println("输入的不是文件夹");
			return;
		}
		
		boolean b = deleteDir(dir);
		if(b) {
			System.out.println("删除成功");
		} else {
			System.out.println("删除失败");
		}
	}

	private static boolean deleteDir(File dir) {
		//列表
		File[] files = dir.listFiles();
		if(files == null) {
			//列表列不出来，尝试删除目录
			return dir.delete();
		}
		//遍历删除子文件和子文件夹
		for (File f : files) {
			if(f.isFile()) {
				//中间一个文件删除失败
				if(! f.delete()) {
					return false;//整个过程停止，目录删除失败
				}
			} else {
				if(! deleteDir(f)) {
					return false;
				}
			}
		}
		//删除dir文件夹
		return dir.delete();
	}
}







