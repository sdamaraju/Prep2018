package exceptionhandling;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class Child extends Parent {
	String age;
	public void testOverriding(Object a) throws FileNotFoundException {
		System.out.println("Hello Child");
	}
}
