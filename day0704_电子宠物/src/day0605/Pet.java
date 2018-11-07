package day0605;

public class Pet {
	String name;
	int full;
	int happy;
	
	public Pet() {
	}
	public Pet(String name) {
		this.name = name;
		this.full = 50;
		this.happy = 50;
	}
	public Pet(String name,
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
		 "打"+name+"的pp，"+name+"哭叫："+cry());
		happy -= 10;
		System.out.println("快乐度："+happy);
	}
	
	public String cry() {
		//无意义代码
		//cry()方法需要在子类中重写
		//返回各自的具体哭叫声
		return "此处有哭叫声";
	}
	
}






