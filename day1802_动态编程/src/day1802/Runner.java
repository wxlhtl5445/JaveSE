package day1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;

public class Runner {
	private static List<String> list = 
			new ArrayList<String>();
	
	static {
		try {
			String path = 
				Runner.class
				.getResource("/config.txt")
				.getPath();
			
			// %xx%xx%xx
			path = URLDecoder.decode(path,"UTF-8");
			
			/*
			 * BR--ISR--FIS--path
			 */
			BufferedReader in = 
			 new BufferedReader(
			 new InputStreamReader(
			 new FileInputStream(path), "GBK"));
			
			String line;
			while((line = in.readLine()) != null) {
				line = line.trim();
				if(line.length() == 0) {
					continue;
				}
				list.add(line);
			}
			System.out.println(list);
			in.close();
		} catch (Exception e) {
			System.out.println(
			"加载配置文件 config.txt 失败");
			e.printStackTrace();
		}
	}
	
	//启动、发动、发射
	public static void launch() throws Exception {
		for (String s : list) {
			//day1802.A  ;  a --> ["day1802.A  ", "a"]
			String[] a = s.split(";");
			Class<?> c = 
			 Class.forName(a[0].trim());
			Object obj = c.newInstance();//无参构造
			Method m = c.getMethod(a[1].trim());
			m.invoke(obj);
		}
	}
}









