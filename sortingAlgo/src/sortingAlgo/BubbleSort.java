package sortingAlgo;

import java.util.Arrays;

public class BubbleSort {
	public static void bubbleSort(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			System.out.println(Arrays.toString(arr));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,4,3,2,1};
		System.out.println("Before sorting: ");
		System.out.println(Arrays.toString(arr));
		System.out.println("After sorting: ");
		bubbleSort(arr);
		

	}

}
