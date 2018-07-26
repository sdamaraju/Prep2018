package algorithmicProblems;

public class MinimumProductInAllTriplets {

	public static void main(String[] args) {
		int array[] = {1,3,5,4,7,6,2,3,1,4,1,1,1};
		int startIndex = findMinimumProductTriplet(array);
		System.out.println(startIndex);
	}
	public static int findMinimumProductTriplet(int[] array){
		int minProduct = Integer.MAX_VALUE;
		int returnIndex = -1;
		for(int i=2;i<array.length;i++){
			int product = array[i] * array[i-1] * array[i-2]; 
			if(minProduct > product){
				minProduct = product;
				returnIndex = i-2;
			}
		}	
		return returnIndex;
	}
	
	public static int findMinimumProductTripletDP(int[] array){
		for(int i=0;i<array.length;i++){
			array[i] = array[i] * array[i-1];
		}
		
		return 0;
	}
	
}
