package day0602;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.print("玩几层汉诺塔：");
		int n = new Scanner(System.in).nextInt();
		
		//n层，A->B->C
		f(n, "A", "B", "C");
	}

	private static void f(
			int n,
			String z1,
			String z2,
			String z3) {
		//最简问题
		if(n==1) {
			System.out.println(z1+"->"+z3);
			return;
		}
		
		//上面n-1层，z1->z3->z2
		f(n-1, z1, z3, z2);
		//最底下一层，z1->z2->z3
		f(1, z1, z2, z3);
		//z2上的n-1层，z2->z1->z3
		f(n-1, z2, z1, z3);
	}
}





