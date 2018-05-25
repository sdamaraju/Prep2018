package staticRelated;

import java.util.ArrayList;
import java.util.List;

public class StaticMethodParentChildOverrideTest {

	public static void main(String[] args) {
		Child c = new  Child();
		((Parent)c).print();
		Parent p = new Parent();
		List<Parent> list = new ArrayList();
		list.add(p);
		list.add(c);
		for(int i =0;i<list.size();i++){
			((Parent)(list.get(i))).printIns();
		}
	}

}
