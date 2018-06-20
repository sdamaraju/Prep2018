package exceptionhandling;

import java.io.IOException;
import java.sql.SQLException;

public class PraentChildExceptionalHandlingOverridingIMPL {

	public static void main(String[] args) throws IOException  {
		Parent p = new Child();
		p.testOverriding(new Object());
	}

}
