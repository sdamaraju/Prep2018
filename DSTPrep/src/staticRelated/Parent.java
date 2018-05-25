package staticRelated;

public class Parent {
	public String name = "";
	
	 static void print(){
		System.out.println("Static from Parent");
	}
	 
	  void printIns(){
			System.out.println("NonStatic from Parent");
		}
	  
	  void parentOnly(){
			System.out.println("method in parent only");
		}
	  
	  public String toString(){
		  return this.name;
	  }

}
