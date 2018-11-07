package day0801;

import java.util.Scanner;

public abstract class GuessGame {
	public void start() {
		String r = suiJi();//产生随机值
		System.out.println(r);
		tiShi();//提示
		while(true) {
			System.out.print("猜：");
			String c = new Scanner(System.in).nextLine();
			//c和r比较，并获得比较结果
			String result = biJiao(c, r);
			System.out.println(result);
			//result是不是猜对的结果
			if(caiDui(result)) {
				break;
			}
		}		
	}

	public abstract String suiJi();
	public abstract void tiShi();
	public abstract String biJiao(String c, String r);
	public abstract boolean caiDui(String result);
}



