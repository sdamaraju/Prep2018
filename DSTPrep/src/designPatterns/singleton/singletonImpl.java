package designPatterns.singleton;

public class singletonImpl {
	
	public static void main(String[] args) {
		SingletonClass sc = SingletonClass.getSingletonObject();
		System.out.println(sc.toString());
	}
	
	

}
