package algorithmicProblems;

public class FirstDuplicateOccuranceOfCharacter {

	//This question can be better solved by using HashMap.
	//Or take an array of 26 elements and, if the alphabet's bit is already set, then return that alphabet else set the 
	//bit of the alphabet in the array.
	
	public static void main(String[] args) { 
		FirstDuplicateOccuranceOfCharacter run = new FirstDuplicateOccuranceOfCharacter();
		String question = "abcdefa";
		int firstDuplicateIndex = run.findFirstDuplicate(question);
		System.out.println(firstDuplicateIndex +" " + question.charAt(firstDuplicateIndex));
		
	}

	private int findFirstDuplicate(String question) {
		int checker = 0;
	      
	        for (int i = 0; i < question.length(); ++i)
	        {
	            int val = (question.charAt(i)-'a');
	      System.out.println(val);
	      System.out.println(checker);
	      System.out.println(1 << val);
	      System.out.println("====");
	            // If bit corresponding to current
	            // character is already set
	            if ((checker & (1 << val)) > 0)
	                return i;
	      
	            // set bit in checker
	            checker = checker | (1 << val);
	        }
	      
	        return -1;
	}
	

}
