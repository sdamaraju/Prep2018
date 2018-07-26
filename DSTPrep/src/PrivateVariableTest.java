
public class PrivateVariableTest {

	private int num1 = 10;

	public boolean equals(Object x){
		if(x instanceof PrivateVariableTest){
			if(((PrivateVariableTest) x).num1 == this.num1)
				return true;
		}
		return false;
	}
}

