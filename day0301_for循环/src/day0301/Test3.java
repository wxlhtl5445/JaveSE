package day0301;

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class Test3 {
	public static void main(String[] args) {
		System.out.print("行数：");
		int n = new Scanner(System.in).nextInt();
		
		System.out.println("\n\n--正方形--------");
		f1(n);//在方法中打印n行正方形
		
		System.out.println("\n\n--三角形--------");
		f2(n);
		
		System.out.println("\n\n--又是三角形--------");
		f3(n);
	}
	
	static void f1(int n) {
		/* i
		 * 1 *****
		 * 2 *****
		 * 3 *****
		 * 4 *****
		 * n *****
		 *   1234n j
		 */
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				System.out.print("*");  
			}
			System.out.println();
		}
	}
	
	static void f2(int n) {
		/* i
		 * 1 *
		 * 2 **
		 * 3 ***
		 * 4 ****
		 * n *****
		 *   1234i j
		 */
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	static void f3(int n) {
		/* i
		 * 1     *
		 * 2    ***
		 * 3   *****
		 * 4  *******
		 * n *********
		 * 
		 * 空格数量是 n-i 个
		 * 星号的数量是 2*i-1 个
		 */
		for(int i=1; i<n; i++) {
			//n-i个空格
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			
			//2*i-1个星号
			for(int j=1; j<=2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
}		




