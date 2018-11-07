package day1801;

import java.lang.reflect.Method;

public class Test4 {
	public static void main(String[] args) throws Exception {
		Class<Student> c = Student.class;
		Student s = new Student(5,"张三","男",22);
		
		//getName(), setName(String)
		Method getName = 
				c.getMethod("getName");
		Method setName =
				c.getMethod("setName", String.class);
		
		Object r = getName.invoke(s);
		System.out.println(r);
		
		setName.invoke(s, "李四");
		System.out.println(s.getName());
		
		
	}
}
