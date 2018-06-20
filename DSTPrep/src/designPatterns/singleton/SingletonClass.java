package designPatterns.singleton;

public class SingletonClass {
	
	public String toString(){
		return "HI";
	}
	
	private static SingletonClass sc = null;
	
	private SingletonClass(){
		
	}
	
	public static SingletonClass getSingletonObject(){
		if(sc == null){
			synchronized (sc) {
				if(sc == null){
					sc = new SingletonClass();
					return sc;
				}else return sc;
			}
		}else return sc;
	}

}
