package day1405;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Test2 {
	public static void main(String[] args) throws Exception {
		/*
		 * OIS--FIS--f3
		 */
		ObjectInputStream in =
		 new ObjectInputStream( 
		 new FileInputStream("d:/abc/f3"));
		
		Student s = (Student) in.readObject();
		System.out.println(s);
		in.close();
		
	}
}
