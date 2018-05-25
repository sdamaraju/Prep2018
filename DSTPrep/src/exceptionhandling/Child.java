package exceptionhandling;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Child extends Parent {

	public void testOverriding() throws FileNotFoundException{
		System.out.println("Hello");
	}
}
