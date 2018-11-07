package day0501;

import java.util.Scanner;

public class Test1 {
	static String[] names = {"iPhone X","华为P20","小米8","vivo","OPPO Find-X"};
	static int[] numbers = {90,100,120,80,50};
	static double[] prices = {7600,5300,3999,4199,2999};
	
	
	public static void main(String[] args) {
		outer:
		while(true) {
			//显示菜单，并获得用户选择的值
			int c = menu();
			switch(c) {
			case 1: f1(); break;
			case 2: f2(); break;
			case 3: f3(); break;
			case 4: f4(); break;
			case 5: break outer;
			}
		}
	}
	
	static int menu() {
		System.out.println("\n\n---------------");
		System.out.println("1. 商品列表");
		System.out.println("2. 商品录入");
		System.out.println("3. 商品查询");
		System.out.println("4. 统计信息");
		System.out.println("5. 退出");
		System.out.println("---------------");
		System.out.print("选择：");
		
		return new Scanner(System.in).nextInt();
	}
	static void f1() {
		/*
		 * ["A", "B", "C"] names
		 * [5,    8,   10] numbers
		 * [122, 199,  20] prices
		 *  i
		 * 1. 名称：A, 数量：5, 价格：122
		 * 2.
		 * 3.
		 */
		//遍历数组
		for(int i=0; i<names.length; i++) {
			String n = names[i];
			int b = numbers[i];
			double p = prices[i];
			
			System.out.println(
			 (i+1)+". 名称："+n+", 数量："+b+", 价格："+p);
			
		}
		
	}
	
	static void f2() {
		/*
		 * ["A", "B", "C"] names
		 * [5,    8,   10] numbers
		 * [122, 199,  20] prices
		 *  i
		 * 
		 * 输入第1件商品：
		 * 名称：x
		 * 数量：1
		 * 价格：1
		 * 
		 * 输入第2件商品：
		 * 
		 */
		//遍历数组
		for(int i=0; i<names.length; i++) {
			System.out.println("\n输入第"+(i+1)+"件商品：");
			System.out.print("名称：");
			names[i] = new Scanner(System.in).nextLine();
			System.out.print("数量：");
			numbers[i] = new Scanner(System.in).nextInt();
			System.out.print("价格：");
			prices[i] = new Scanner(System.in).nextDouble();
		}
		
		//重新显示列表
		f1();
	}
	
	static void f3() {
		/*
		 *   B
		 * 
		 * ["A", "B", "C"] names
		 * [5,    8,   10] numbers
		 * [122, 199,  20] prices
		 *  i
		 */ 
		System.out.print("查询的商品名称：");
		String t = 
		 new Scanner(System.in).nextLine();
		//遍历数组
		for(int i=0; i<names.length; i++) {
			//如果t和names[i]名称相同
			//比较字符串必须用equals()方法
			if(t.equals(names[i])) {
				String n = names[i];
				int b = numbers[i];
				double p = prices[i];
				
				System.out.println(
				 (i+1)+". 名称："+n+", 数量："+b+", 价格："+p);
				return;
			}
		}
		
		System.out.println("找不到此商品");

	}
	
	
	static void f4() {
		/*
		 * ["A", "B", "C"] names
		 * [5,    8,   10] numbers
		 * [122, 199,  20] prices
		 *  i
		 *  
		 * 商品总价
		 * 单价均价
		 * 最高总价
		 * 最高单价
		 */
		double spzj = 0;//商品总价
		double djzj = 0;//单价总价
		double zgzj = 0;//最高总价
		double zgdj = 0;//最高单价
		
		//遍历数组
		for(int i=0;i<names.length;i++) {
			spzj += numbers[i]*prices[i];
			djzj += prices[i];
			//如果总价比 zgzj 还高，把这个更高的值
			//存到 zgzj 变量
			if(numbers[i]*prices[i] > zgzj) {
				zgzj = numbers[i]*prices[i];
			}
			if(prices[i] > zgdj) {
				zgdj = prices[i];
			}
		}
		
		System.out.println("商品总价："+spzj);
		System.out.println("单价均价："+(djzj/names.length));
		System.out.println("最高总价："+zgzj);
		System.out.println("最高单价："+zgdj);
	}
	
	
	
}
