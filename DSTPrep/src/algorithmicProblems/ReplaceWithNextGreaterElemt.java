
package algorithmicProblems;

import java.util.Stack;

public class ReplaceWithNextGreaterElemt {

	public static void main(String[] args) {
		int array[] = {1,2,5,3,4,6,9};
		int result[] = replaceWithNeceGreaterElement(array);
		for(int i=0;i<result.length;i++){
			System.out.println(result[i]);
		}
	}

	public static int[] replaceWithNeceGreaterElement(int [] array){
		Stack st = new Stack();
		for(int i=0;i<array.length-1;i++){
			st.push(i);
			while(!st.empty()){
				if(array[(int)st.peek()] < array[i+1]){
					array[(int)st.pop()] = array[i+1];
				}else{
					break;
				}
			}
		}
		return array;
	}
}
