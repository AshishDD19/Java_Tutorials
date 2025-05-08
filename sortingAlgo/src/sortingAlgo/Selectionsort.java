package sortingAlgo;

import java.util.Arrays;

public class Selectionsort {
	public static int[] selectionSort(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			int min = i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j] < arr[min]) {
					min = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,-1,4,6,1,5};
		int res[] = selectionSort(arr);
		System.out.println(Arrays.toString(res));
	}

}
