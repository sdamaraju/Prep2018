package sort;

public class MergeSortImpl {

	public static void main(String[] args) {
		MergeSort sort = new MergeSort();
		int a[] = {9,6,15,7};
		sort.mergeout(a, 0, 3);
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}

}
