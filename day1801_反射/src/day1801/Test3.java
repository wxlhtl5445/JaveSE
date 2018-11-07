package day1801;

import java.lang.reflect.Field;

public class Test3 {
	public static void main(String[] args) throws Exception {
		Class<Student> c = Student.class;
		Student s = new Student(5,"张三","男",22);
		
		//反射访问变量id
		Field id = c.getDeclaredField("id");
		
		id.setAccessible(true);
		
		Object v = id.get(s);//反射访问变量的值
		System.out.println(v);
		
		id.set(s, 999);//反射为变量赋值
		System.out.println(s.getId());
		
	}
}



