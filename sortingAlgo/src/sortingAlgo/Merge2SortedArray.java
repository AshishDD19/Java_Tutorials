package sortingAlgo;

import java.util.Arrays;

public class Merge2SortedArray {
	public static void sortingAndMerge(int arr1[] ,int arr2[]) {
		int n = arr1.length;
		int m = arr2.length;
		int res[] = new int[n+m];
		int i=0;
		int j=0;
		int k=0;
		while(i<n && j<m) {
			if(arr1[i] < arr2[j]) {
				res[k] = arr1[i];
				i++;
				k++;
			}
			else {
				res[k] = arr2[j];
				j++;
				k++;
			}
		}
		
		while(i<n) {
			res[k] = arr1[i];
			k++;
			i++;
		}
		
		while(j<m) {
			res[k] = arr2[j];
			j++;
			k++;
		}
		
		System.out.println(Arrays.toString(res));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {2,4,6};
		int arr2[] = {1,5,7,9,11};
		
		sortingAndMerge(arr1, arr2);
		
		

	}

}
