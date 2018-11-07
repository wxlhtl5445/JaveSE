package day0402;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		System.out.print("输入整数：");
		int a = new Scanner(System.in).nextInt();
		
		/*
		 * a右移24,16,8,0位，再强转成byte
		 */
		byte b1 = (byte) (a>>24);
		byte b2 = (byte) (a>>16);
		byte b3 = (byte) (a>>8);
		byte b4 = (byte) (a>>0);
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		
		/*
		 * 合并
		 * 四个字节值，
		 * 先左移24位（把左侧的1，都顶出去）
		 * 再不带符号右移0,8,16,24位
		 * 再与r求位或，结果保存到r
		 */
		int r = 0;
		r = r | (b1<<24>>>0);
		r = r | (b2<<24>>>8);
		r = r | (b3<<24>>>16);
		r = r | (b4<<24>>>24);
		
		System.out.println(r);
		
		r = 0;
		/*
		 * 四个字节值
		 * 先和0x000000ff求位与
		 * 再左移24,16,8,0位
		 * 再与r求位或，结果赋给r
		 */
		r = r | ((b1&0x000000ff) << 24);
		r = r | ((b2&0x000000ff) << 16);
		r = r | ((b3&0x000000ff) << 8);
		r = r | ((b4&0x000000ff) << 0);
		System.out.println(r);
	}
}	







