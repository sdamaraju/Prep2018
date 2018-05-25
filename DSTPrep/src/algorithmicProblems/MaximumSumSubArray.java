package algorithmicProblems;

public class MaximumSumSubArray {

	public static void main(String[] args) {
		int array[]={7,-6,4,3,2,-5};
		int ans = maxSumSubArray2(array);
		System.out.println(ans);
	}
	
	private static int maxSumSubArray(int array[]){
		int ans = Integer.MIN_VALUE;
		int sum= 0;
		for(int i=1;i<=array.length;i++){ // for each size of subarray, from 1 to n, i is the length of sub array
			for(int subArrayStartIndex=0;subArrayStartIndex<array.length;subArrayStartIndex++){
				if( subArrayStartIndex+i > array.length){
					break;
				}else{
					sum = 0;
					for(int k=subArrayStartIndex;k<subArrayStartIndex+i;k++){
						sum = sum + array[k];
					}
					System.out.println(sum);
					if(ans < sum){
						ans = sum;
						
					}
				}
				
			}
		}
		return ans;
	}

	private static int maxSumSubArray2(int array[]){
		int ans = Integer.MIN_VALUE;
		for(int startIndex = 0; startIndex < array.length ; startIndex++){
			int sum = 0;
			for(int i=startIndex;i< array.length;i++){
				sum = sum + array[i];
				System.out.println(sum);
				if(ans < sum){
					ans = sum;
					System.out.println("ANS changed ->" +ans);
				}
				
			}
			
		}
		System.out.println(ans);
		return ans;
	}
	
}
