package collections.myOwnArrayList.hashmapimpl;

public class Words extends Object{
	
	String word;
	int length;
	
	Words(String word){
		this.word = word;
		this.length = word.length();
	}

	@Override
	public String toString() {
		return "Words [word=" + word + ", length=" + length + "]";
	}

	public int hashCode(){
		return word.length();
	}
	
	public boolean equals(Object b){
		if(b instanceof Words){
			if(this.word.equalsIgnoreCase((((Words)b).word))){
				return true;
			}else return false;
					
		}
		return false;
	}
}
