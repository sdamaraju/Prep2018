
public class arrays {
	private String abc = null;
	
	public static void main(String[] args) {
		char [] obs = new char[10];
		obs[0] = '1';obs[1]='2';
		System.out.println("HHH"+obs[3]+"HH");
		int[] a= {1,2,3,};
		System.out.println(a.length);
		arrays test = new arrays();
		test.getChildClassObject().m1();
	}

	private class childclass{
		public String ab=null;
	public void m1(){
		ab = abc;}
	}
	
	public childclass getChildClassObject(){
		return new childclass();
	}
	
}
