package algorithmicProblems;

import java.util.ArrayList;
import java.util.List;

public class BinarySequence {

	public static void main(String[] args) {
		int array[] = {1,1,1,1,1,1,1,0,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1,1};
		int index = findZeroIndexToRelaceForMax1Sequence(array);
		System.out.println(index);
	}
	
	public static int findZeroIndexToRelaceForMax1Sequence(int binarySequence[]){
		List<Integer> listOfZeroIndices = new ArrayList<Integer>();
		int indexToReturn = 0;
		for(int i=0;i<binarySequence.length;i++){
			if(binarySequence[i]==0){
				listOfZeroIndices.add(i);
			}
		}
		int maxDiff = -1;
		for(int j=0;j<listOfZeroIndices.size();j++){
			int diff = -1;
			if(j==0){
				diff = listOfZeroIndices.get(j+1);
			}else if(j==listOfZeroIndices.size()-1){
				diff = listOfZeroIndices.size() - listOfZeroIndices.get(j-1);
			}else{
				diff = listOfZeroIndices.get(j+1) - listOfZeroIndices.get(j-1);
			}
			if(diff > maxDiff){
				maxDiff = diff;
				indexToReturn = listOfZeroIndices.get(j);
			}
		}
		
		return indexToReturn;
	}

}
