package day0801;

import java.util.Random;

public class GuessLetterGame extends GuessGame {
	@Override
	public String suiJi() {
		/* ABCDEFGHIJKLMNOPQRSTUVWXYZ
		 * 
		 *                 j         
		 * LTCDEFGHIJKAMNOPQRSBUVWXYZ
		 *   i
		 *   
		 *   t = C
		 *   
		 *   LTCDE
		 */
		//新建StringBuilder对象包含26个大写字母
		StringBuilder sb = new StringBuilder(
				"ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		//循环访问前5个位置
		for(int i=0;i<5;i++) {
			//26个位置中随机定位
			int j = new Random().nextInt(26);
			char t = sb.charAt(i);
			sb.setCharAt(i, sb.charAt(j));
			sb.setCharAt(j, t);
		}
		//删除 [5, 26)
		sb.delete(5, 26);
		return sb.toString();
	}
	
	
	@Override
	public void tiShi() {
		System.out.println(
			"已经随机产生了5个不重复的大写字母");
		System.out.println("请猜这5个字母");
	}
	
	
	@Override
	public String biJiao(String c, String r) {
		/*
		 *            a=2, b=2
		 * r EPCYN
		 *    j     
		 * c YPCED
		 *    i
		 */
		int a = 0;
		int b = 0;
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				//i位置字符和j位置字符相等
				if(c.charAt(i) == r.charAt(j)) {    
					//再判断位置是否相等
					if(i==j) a++;
					else b++;
					
					break;
				}
			}
		}		
		return a+"A"+b+"B";
	}
	
	
	
	@Override
	public boolean caiDui(String result) {
		return "5A0B".equals(result);
	}
}
