package sort;

public class MergeSort {
	
	private void mergeinto(int a[],int l,int m,int r){
		int n1 = m-l+1;
		int n2 = r-m;
		
		int L[] = new int[n1];
		int R[] = new int[n2];
		
		for(int i=0;i<m-l + 1;i++){
			L[i] = a[l+i];
		}
		
		for(int j=0;j<r-m;j++){
			R[j] = a[m+1+j];//
		}
		
		int i=0,j=0,k=l;  
		while(i < n1 && j < n2){
			if(L[i] < R[j]){
				a[k] = L[i];
				k++;
				i++;
			}else{
				a[k] = R[j];
				k++;j++;
			}
		}
		while(i<n1){
			a[k] = L[i];
			i++;k++;
		}
		while(j<n2){
			a[k]=R[j];
			k++;j++;
		}
		
	}

	public void mergeout(int a[], int l,int r){
		if(l<r){
			int m = (l+r)/2; 
			mergeout(a,l,m);
			mergeout(a,m+1,r);
			mergeinto(a,l,m,r);
		}
	}
}
