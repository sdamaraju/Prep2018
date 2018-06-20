package immutableClass;

import java.util.Date;

public class immmutableAndFinalVariableTestImpl {

	public static void main(String[] args) {
		
		final Student s = new Student("Teja",25,new Date("10/16/1990"));
		System.out.println(s);
		// s.name = "D S K Teja"; not possible as the name variable is a final variable
		System.out.println(s);
		s.getDob().setMonth(11);
		System.out.println(s);
		
	}

}
