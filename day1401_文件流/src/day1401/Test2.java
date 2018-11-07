package day1401;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test2 {
	public static void main(String[] args) throws Exception {
		/*
		 * FIS--f1
		 */
		FileInputStream in = 
		 new FileInputStream("d:/abc/f1");
		
		//单字节循环读取标准格式
		int b;//保存每次读取的字节值
		while((b=in.read()) != -1) {
			System.out.println(b);
		}
		
		in.close();
	}
}







