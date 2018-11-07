package day1501;

import java.io.UnsupportedEncodingException;

public class Test2 {
	public static void main(String[] args) throws Exception {
		byte[] a;
		String s;
		a = new byte[] {97, 98, 99, -42, -48, -50, -60, -122, -76, -23, 70};
		s = f(a, null);//从默认转成Unicode
		System.out.println(s);
		a = new byte[] {97, 98, 99, -42, -48, -50, -60, -122, -76, -23, 70};
		s = f(a, "GBK");//从指定编码转成Unicode
		System.out.println(s);
		a = new byte[] {97, 98, 99, -42, -48, -50, -60, 63, 63};
		s = f(a, "GB2312");
		System.out.println(s);
		a = new byte[] {97, 98, 99, -28, -72, -83, -26, -106, -121, -27, -106, -122, -23, -107, -107};
		s = f(a, "UTF-8");
		System.out.println(s);
	}

	private static String f(
			byte[] a, String charset) throws Exception {
		String s;
		if(charset == null) {
			s = new String(a);
		} else {
			s = new String(a, charset);
		}
		return s;
	}
}






