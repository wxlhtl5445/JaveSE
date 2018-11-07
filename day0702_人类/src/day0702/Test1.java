package day0702;

public class Test1 {
	public static void main(String[] args) {
		Person p = new Person("张三","男",16);
		Student s = new Student();
		Employee e = new Employee();
		
		s.name = "李四";
		s.gender = "女";
		s.age = 18;
		s.school = "家里蹲大学";
		
		e.name = "王五";
		e.gender = "男";
		e.age = 19;
		e.salary = 8000;
		System.out.println(p.toString());
		System.out.println(s.toString());
		System.out.println(e.toString());
		
		f(p);
		f(s);
		f(e);
	}
	
	
	static void f(Person p) {
		System.out.println("\n\n--当做父类型处理-------");
		System.out.println(p.toString());
	}
	
}












