package day0507;

import java.util.Arrays;
import java.util.Random;

public class Test1 {
	public static void main(String[] args) {
		int[] a = suiJi();
		int[] b = suiJi();
		Arrays.sort(a);
		Arrays.sort(b);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		int[] c = heBing(a, b);
		System.out.println(Arrays.toString(c));
	}
	
	private static int[] heBing(int[] a, int[] b) {
		/*
		 * a[1, 7, 17, 34]
		 *                 j
		 * b[15, 18, 19, 43, 57, 70, 83]
		 *               k
		 * 
		 * c[1         ]
		 *     i
		 */
		int j=0;
		int k=0;
		
		int[] c = new int[a.length+b.length];
		for(int i=0;i<c.length;i++) {
			if(j == a.length) {
				//c[i] = b[k];
				//k++;
				//continue;
				System.arraycopy(
						b,k,c,i,b.length-k);
				break;
			}
			if(k == b.length) {
				//c[i] = a[j];
				//j++;
				//continue;
				System.arraycopy(
						a,j,c,i,a.length-j);
				break;
			}
			
			if(a[j]<b[k]) {
				c[i] = a[j];
				j++;
			} else {
				c[i] = b[k];
				k++;
			}
		}
		
		return c;
		
	}

	private static int[] suiJi() {
		int n = 5+ new Random().nextInt(6);
		int[] a = new int[n];
		for(int i=0;i<a.length;i++) {
			a[i] = new Random().nextInt(100);
		}
		return a;
	}
}




