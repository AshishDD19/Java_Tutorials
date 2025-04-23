package sortingAlgo;

import java.util.Arrays;

public class Merge2sortedArray2 {
	
	public static void mergeAndSort(int arr1[],int arr2[]) {
		int n = arr1.length;
		int m = arr2.length;
		int res[] = new int[n+m];
		int i = 0;
		int j = arr2.length - 1;
		int k = 0;
		while(i<n && j >=0) {
			if(arr1[i] < arr2[j]) {
				res[k++] = arr1[i++];
			}
			else {
				res[k++] = arr2[j--];
			}
		}
		
		while(i<n) {
			res[k++] = arr1[i++];
		}
		while(j>=0) {
			res[k++] = arr2[j--];
		}
	
		System.out.println(Arrays.toString(res));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {2,4,5,7,9};
		int arr2[] = {10,6,3,1}; // Descending order
		mergeAndSort(arr1, arr2);
	

	}

}
