package day0603;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		//新建Soldier[]数组，长度5
		Soldier[] a = new Soldier[5];
		//遍历数组，存入5个士兵
		for(int i=0;i<a.length;i++) {
			a[i] = new Soldier();
			a[i].id = i+1;
		}
		
		System.out.println("已创建5个士兵");
		System.out.println("回车进攻");
		
		//当还有存活士兵
		while(Soldier.count != 0) {
			new Scanner(System.in).nextLine();
			System.out.println("\n----------");
			for(int i=0;i<a.length;i++) {
				a[i].attack();
			}
			System.out.println("士兵数量："+Soldier.count);
			System.out.println("----------");
		}
		
	}
}



