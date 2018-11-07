package day1104;

import java.util.Scanner;

import day1104.Formula.DieDaiQi;

public class Test1 {
	public static void main(String[] args) {
		System.out.println("输入算式：");
		String s = new Scanner(System.in).nextLine();
		//封装到 Formula 对象
		Formula f = new Formula(s);
		//创建迭代器
		/*DieDaiQi it = f.iterator();
		while(it.hasNext()) {
			String b = it.next();
			System.out.println(b);
		}*/
		try {
			//求值
			double r = f.eval();
			System.out.println(r);
		} catch (Exception e) {
			System.out.println("输入的算式格式错误");
		}
	}
}




