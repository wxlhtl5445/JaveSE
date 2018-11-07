package day1502;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

public class Test1 {
	public static void main(String[] args) throws Exception {
		/*
		 * f4 保存GBK编码
		 * f5 保存UTF-8编码
		 * 
		 * OSW--FOS--f4, GBK
		 * OSW--FOS--f5, UTF-8
		 */
		OutputStreamWriter out1 = 
		 new OutputStreamWriter(
		 new FileOutputStream("d:/abc/f4"), "GBK");
		OutputStreamWriter out2 = 
		 new OutputStreamWriter(
		 new FileOutputStream("d:/abc/f5"), "UTF-8");
		
		out1.write("abc中文");
		out2.write("abc中文");
		
		out1.close();
		out2.close();
		
		 
		
	}
}





