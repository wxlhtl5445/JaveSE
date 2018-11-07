package day1404;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		/*
		 * d:/abc/a.jpg
		 * [d:/abc/a.jpg_split]
		 *         a.jpg.1
		 *         a.jpg.2
		 *         a.jpg.3
		 *         a.jpg.4
		 */
		System.out.println("要拆分的文件：");
		String s1 = new Scanner(System.in).nextLine();
		File from = new File(s1);
		if(! from.isFile()) {
			System.out.println("不是文件");
			return;
		}
		
		System.out.println("拆分文件的大小（Kb）：");
		long size = new Scanner(System.in).nextLong();
		size *= 1024; // Kb --> byte
		
		try {
			split(from, size);
			System.out.println("完成");
		} catch (Exception e) {
			System.out.println("失败");
			e.printStackTrace();
		}
	}

	private static void split(File from, long size) throws Exception {
		//准备文件夹
		File dir = zbwjj(from);
		//System.out.println(dir.getAbsolutePath());
		//原文件名
		String name = from.getName();
		
		long byteCount=0;//字节计数
		int fileCount=0;//文件计数		
		BufferedInputStream in =
				new BufferedInputStream(
				new FileInputStream(from));
		BufferedOutputStream out = null;		
		int b;
		while((b = in.read()) != -1) {
			//没有输出流，或文件存满
			if(out == null || byteCount==size) {
				if(byteCount==size) {
					out.close();//关闭前一个输出流
				}
				out =
				  new BufferedOutputStream(
				  new FileOutputStream(
				  new File(dir, name+"."+(++fileCount))));
				byteCount=0;
			}
			out.write(b);
			byteCount++;
		}
		in.close();
		out.close();
		
	}

	private static File zbwjj(File from) {
		File dir = new File(
			from.getAbsoluteFile()+"_split");
		if(! dir.exists()) {//文件夹不存在
			dir.mkdirs();//新建文件夹
		} else {
			clean(dir);//清空文件夹
		}
		return dir;
	}

	private static void clean(File dir) {
		File[] files = dir.listFiles();
		for (File f : files) {
			if(f.isFile()) {
				f.delete();//删除文件f
			} else {
				clean(f);//清空文件夹f
				f.delete();//删除文件夹f
			}
		}
	}
}








