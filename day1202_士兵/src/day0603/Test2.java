package day0603;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		System.out.print("需要多少士兵：");
		int n = new Scanner(System.in).nextInt();
		
		//新建ArrayList对象，设置内部数组初始容量n
		ArrayList<Soldier> list = new ArrayList<>(n);
		for(int i=1;i<=n;i++) {
			Soldier s = new Soldier();
			s.id = i;
			list.add(s);//士兵对象添加到集合
		}
		
		//当还有士兵
		while(list.size() != 0) {
			new Scanner(System.in).nextLine();
			//迭代遍历，取出士兵进攻，自己写
			for(Iterator<Soldier> it = list.iterator(); it.hasNext();) {
				Soldier s = it.next();
				s.attack();
				if(s.blood == 0) {
					//迭代遍历期间，不允许直接用集合增删数据
					//list.remove(s); 
					
					//从集合删除士兵s
					it.remove();//删除刚刚取出的数据
				}
			}
			System.out.println("士兵数量："+list.size());
			System.out.println("\n--------------");
		}
	}
}








