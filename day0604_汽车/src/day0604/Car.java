package day0604;
/*
 * 封装
 * 把汽车相关的属性数据，和逻辑运算方法，
 * 封装成“类”组件
 */
public class Car {
	String brand;//null
	String color;//null
	int speed;//0
	
	public Car(String brand,String color,int speed) {
		//有同名局部变量
		//必须用this.brand来访问成员变量
		this.brand = brand;
		this.color = color;
		this.speed = speed;
	}
	
	public void go() {
		System.out.println(
		 color+brand+"前进，时速："+speed);
	}
	public void stop() {
		System.out.println(
		 color+brand+"停止");
	}
}











