package day0801;

import java.util.Random;

public class GuessNumberGame extends GuessGame {
	@Override
	public String suiJi() {
		int r = 1+ new Random().nextInt(1000);
		//int 转成 String
		String s = String.valueOf(r);
		return s;
	}
	@Override
	public void tiShi() {
		System.out.println(
		 "已经产生了一个[1,1001)范围的随机整数");
		System.out.println("请猜这个数是几");
	}
	@Override
	public String biJiao(String c, String r) {
		//String 解析转成 int
		int a = Integer.parseInt(c);
		int b = Integer.parseInt(r);
		if(a>b) {
			return "大";
		} else if(a<b) {
			return "小";
		} else {
			return "对";
		}
	}
	@Override
	public boolean caiDui(String result) {
		return "对".equals(result);
	}
}




