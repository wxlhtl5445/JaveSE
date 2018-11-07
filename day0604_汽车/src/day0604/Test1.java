package day0604;

public class Test1 {
	public static void main(String[] args) {
		//新建Car对象，存到变量c1
		//新建Car对象，存到变量c2
		Car c1 = new Car("别摸我","红色",230);
		Car c2 = new Car("保+洁","绿色",30);
		
		//给c1和c2的成员变量赋值
		//c1.brand = "别摸我";
		//c1.color = "红色";
		//c1.speed = 230;
		
		//c2.brand = "保+洁";
		//c2.color = "绿色";
		//c2.speed = 30;
		
		c1.go();
		c1.stop();
		c2.go();
		c2.stop();
	}
}
