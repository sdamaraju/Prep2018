package staticRelated;

public class Child extends Parent {
	
	static void print(){
		System.out.println("Static from Child");
	}
	
	void printIns(){
		System.out.println("NonStatic from Child");
	}
	
	void childOnly(){
		System.out.println("method in Child only");
	}
	
}
