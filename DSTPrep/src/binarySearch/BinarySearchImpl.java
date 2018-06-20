package binarySearch;

public class BinarySearchImpl {

	public static void main(String[] args) {
		int arr[] = {6,9,25,36,76};
		int key = 376;
		int index = binarySearch(arr,key);
		System.out.println(index);
	}
	
	private static int binarySearch(int a[],int key){
		int min = 0;
		int max = a.length;
		int mid = 0;
		int i = 0;
		while(i<a.length){
			mid = (min+max)/2 ;
			if(key == a[mid]){
				return mid;
			}
			if(key > a[mid]){
				min = mid;
			}else if(key < a[mid]){
				max = mid;
			}
			i++;
		}
		return -1;
	}

}
