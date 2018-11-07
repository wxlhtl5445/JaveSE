package day1803;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Runner {
	public static void launch(Class<?> c) throws Exception {
		Object obj = c.newInstance();
		Method[] a = c.getMethods();
		ArrayList<Method> list = new ArrayList<>();
		for (Method m : a) {
			Test test =
			 m.getAnnotation(Test.class);
			
			if(test != null) {
				list.add(m);
				//int id = test.id();
				//String value = test.value();
				//System.out.println(
				// "\n\n------- id:"+id+", value:"+value);
				//m.invoke(obj);
			}
		}
		
		Collections.sort(list, new Comparator<Method>() {
			@Override
			public int compare(Method o1, Method o2) {
				Test t1 = o1.getAnnotation(Test.class);
				Test t2 = o2.getAnnotation(Test.class);
				return t1.id() - t2.id();
			}
		});
		
		for (Method m : list) {
			Test test = m.getAnnotation(Test.class);
			int id = test.id();
			String value = test.value();
			System.out.println(
			 "\n\n------- id:"+id+", value:"+value);
			m.invoke(obj);
		}
		
	}
}




