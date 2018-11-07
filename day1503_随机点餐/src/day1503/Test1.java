package day1503;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Test1 {
	private static List<Food> list;
	
	public static void main(String[] args) throws Exception {
		System.out.println("按回车选择食物");
		while(true) {
			new Scanner(System.in).nextLine();

			//加载food-list.txt，生成一个集合
			list = load();
			//System.out.println(list);
			
			int index = list.size()/3*2;
			//存放随机挑选的事物的数组
			Food[] a = new Food[3];
			a[0] = 
			 list.get(new Random().nextInt(index));
			//死循环选择第二个
			while(true) {
				Food f = 
				 list.get(new Random().nextInt(index));
				//重复的选择了同一个对象
				if(f == a[0]) {
					continue;
				}
				a[1] = f;
				break;
			}
			//第三个
			//index+[0,size()-index)
			a[2] = list.get(
				index+new Random().nextInt(
						list.size()-index));
			
			//三个食物的选择次数递增
			for (Food f : a) {
				f.setTimes(f.getTimes()+1);
			}
			
			//list中所有食物，重新排序
			Collections.sort(list);
			
			//list中数据，保存到文件
			save(list);
			
			//显示选择结果
			for (Food f : a) {
				System.out.println(f.getName());
			}
		}
		
		
	}

	private static void save(List<Food> list) throws Exception {
		String path = getPath();
		/*
		 * PW--OSW--FOS--path
		 */
		PrintWriter out = 
		 new PrintWriter(
		 new OutputStreamWriter(
		 new FileOutputStream(path),"GBK"));
		for (Food f : list) {
			out.println(f);
		}
		out.close();
	}

	private static List<Food> load() throws Exception {
		//获得文件路径
		String path = getPath();
		//System.out.println(path);
		/*
		 * BR--ISR--FIS--path
		 */
		List<Food> list = 
			new ArrayList<>();
		
		BufferedReader in = 
		 new BufferedReader(
		 new InputStreamReader(
		 new FileInputStream(path),"GBK"));
		
		String line;
		while((line=in.readLine()) != null) {
			line = line.trim();
			if("".equals(line)) {
				continue;
			}
			//宫保鸡丁;0 --> ["宫保鸡丁", "0"]
			String[] a = line.split(";");
			Food f = new Food(
				a[0].trim(), 
				Integer.parseInt(a[1].trim()));
			list.add(f);
		}		
		return list;
	}

	private static String getPath() throws Exception {
		/*
		 * Test1.class，存放在
		 * D:\lesson\1809\ws1809\day1503_随机点餐\bin
		 * 与Test1.class存放在一起的文件，
		 * 可以相对于bin目录来访问
		 * 
		 * "/" 程序的运行目录,bin目录
		 * "/food-list.txt"
		 * "/day1503/food-list.txt"
		 */
		//返回URL编码格式
		//中文编码成UTF-8字节值
		//%e9%9a%8f
		String path = 
			Test1.class
			.getResource("/food-list.txt")
			.getPath();
		
		//URL解码回正常的中文
		path = URLDecoder.decode(path,"UTF-8");
		
		return path;
		
	}
}







