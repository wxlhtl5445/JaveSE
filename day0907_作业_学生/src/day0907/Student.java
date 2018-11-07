package day0907;

public class Student {
	private int id;
	private String name;
	private String gender;
	private int age;
	
	
	public Student() {
		super();
	}
	public Student(int id, String name, String gender, int age) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return id+", "+name+", "+gender+", "+age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		if(obj == this) return true;
		if(! (obj instanceof Student)) return false;
		
		Student s = (Student) obj;
		return 
				id==s.id &&
				name.equals(s.name) &&
				gender.equals(s.gender) &&
				age==s.age;
	}
}




