package immutableClass;

import java.util.Date;

public class Student {

	final String name;
	final int age;
	private final Date dob;
	
	public Student(String name, int age, Date dob) {
		super();
		this.name = name;
		this.age = age;
		this.dob = dob;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Date getDob() {
		Date cloneDob = (Date)dob.clone();
		return cloneDob;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", dob=" + dob + "]";
	}
	
	
}
