package day0605;

public class Dog {
	String name;
	int full;
	int happy;
	
	public Dog() {
	}
	public Dog(String name) {
		this.name = name;
		this.full = 50;
		this.happy = 50;
	}
	public Dog(String name,
			   int full,
			   int happy) {
		this.name = name;
		this.full = full;
		this.happy = happy;
	}
	
	public void feed() {
		if(full == 100) {
			System.out.println(name+"已经吃不下了");
			return;
		}
		System.out.println("给"+name+"喂食");
		full += 10;
		System.out.println("饱食度："+full);
	}
	
	public void play() {
		if(full == 0) {
			System.out.println(name+"饿得玩不动了");
			return;
		}
		System.out.println("陪"+name+"玩耍");
		happy += 10;
		full -= 10;
		System.out.println(
		 "快乐度："+happy+"，饱食度："+full);
	}
	
	public void punish() {
		System.out.println(
		 "打"+name+"的pp，"+name+"哭叫：汪~");
		happy -= 10;
		System.out.println("快乐度："+happy);
	}
}
