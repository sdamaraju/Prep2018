package passByReference;

import staticRelated.Parent;

public class PassByReferenceImpl extends Parent{

	public static void main(String[] args) {
		Parent p = new Parent();
		p.name = "Parent";
		passByRef(p);
		Parent t = p;
	//	p=null;
		t = null;
		System.out.println(p);
	}
	public static void passByRef(Parent p){
		p=null;
		//p.name = "new";
		//p.name="passedByRef";
		System.out.println(p);
	}

}
