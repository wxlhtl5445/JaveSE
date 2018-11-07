package day1404;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		System.out.println("拆分文件存放目录：");
		String s1 = new Scanner(System.in).nextLine();
		File dir = new File(s1);
		if(! dir.isDirectory()) {
			System.out.println("不是文件夹");
			return;
		}
		
		
		System.out.println("合并的目标文件：");
		String s2 = new Scanner(System.in).nextLine();
		File to = new File(s2);
		if(to.isDirectory()) {
			System.out.println("不能是文件夹");
			return;
		}
		
		try {
			heBing(dir, to);
			System.out.println("完成");
		} catch (Exception e) {
			System.out.println("失败");
			e.printStackTrace();
		}
		
		
	}

	private static void heBing(
			File dir, File to) throws Exception{
		//对dir目录列表
		File[] files = list(dir);
		//输出流
		FileOutputStream out = new FileOutputStream(to);
		FileInputStream in;
		byte[] buff = new byte[8192];
		int n;//每一批的数量
		
		//遍历文件列表
		for (File f : files) {
			in = new FileInputStream(f);
			while((n = in.read(buff)) != -1) {
				out.write(buff,0,n);
			}
			in.close();
		}
		out.close();
	}

	private static File[] list(File dir) {
		File[] files = dir.listFiles();
		Arrays.sort(files, new Comparator<File>() {
			@Override
			public int compare(File o1, File o2) {
				String n1 = o1.getName();
				String n2 = o2.getName();
				// xxx.xx.23 --> 23
				n1 = n1.substring(n1.lastIndexOf(".")+1);
				n2 = n2.substring(n2.lastIndexOf(".")+1);
				int a = Integer.parseInt(n1);
				int b = Integer.parseInt(n2);
				return a-b;				
			}
		});
		return files;
	}
}





