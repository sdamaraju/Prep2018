package exceptionhandling;

import java.io.IOException;
import java.sql.SQLException;

public class Parent {
	String name;
	
	protected void testOverriding (Object a) throws IOException{
		System.out.println("Hello");
	}

}
