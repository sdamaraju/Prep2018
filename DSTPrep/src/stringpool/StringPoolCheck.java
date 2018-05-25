package stringpool;

public class StringPoolCheck {

	public static void main(String[] args) {
		String st1 = new String("Hello");
		String st2 = new String("Hello");
		System.out.println(st1==st2);
		String st3 = "Hello";
		String st4 = "Hello";
		System.out.println(st3==st4);
		System.out.println(st2==st3);
		System.out.println(st1.intern()==st3);
		System.out.println(st1==st3);
		String st5 = new String("Hello").intern();
		System.out.println(st5 == "Hello");
	}

	
	 /* public static void main(String[] args)
	  {
	    String s1 = "Hello";
		String s2 = s1;
		String s3 = new String("Hello");
		String s4 = "lo";
		System.out.println(s1 == s3.intern()); 
		System.out.println(s1 == "Hello"); //true
		System.out.println(s1 == s2); //true
		System.out.println(s1 == s3); //false
	 
		//Strings computed by concatenation at 
		//run-time are newly created and therefore distinct.
		System.out.println("Mytest");
		System.out.println("Hello" == ("Hel"+s4).intern()); //flase
	 
		//s3 is not literal, so distinct
		System.out.println(s3 == ("Hel"+s4).intern()); //false
	 
		//The result of explicitly interning a computed string is the same 
		//string as any pre-existing literal string with the same contents.
		System.out.println(s1 == s3.intern()); //true
		System.out.println("Hello" == ("Hel"+s4).intern()); //true
		System.out.println(s1 == ("Hel"+s4).intern()); //true
		System.out.println(s3.intern() == ("Hel"+s4).intern()); //true
	  }*/
	
	
}
