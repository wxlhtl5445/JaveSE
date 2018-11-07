package day0605;

import java.util.Random;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.print("给宠物起个名：");
		String name = 
		 new Scanner(System.in).nextLine();
		//新建Dog对象，存到变量dog
		Dog dog = new Dog(name);
		//给dog的三个属性赋值
		//dog.name = name;
		//dog.happy = 50;
		//dog.full = 50;
		
		System.out.println(
		 "恭喜你已经领养了一只新的宠物");
		System.out.println("按回车继续");
		
		//调用 play() 方法， 把dog对象传递到这个方法
		play(dog);
	}

	private static void play(Dog dog) {
		while(true) {
			new Scanner(System.in).nextLine();
			int r = new Random().nextInt(3);
			switch(r) {
			case 0: dog.feed(); break;
			case 1: dog.play(); break;
			case 2: dog.punish(); break;
			}
		}
	}
}








