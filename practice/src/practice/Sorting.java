package practice;

import java.util.Arrays;

public class Sorting {
	
	static int [] sort(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j] > arr[j+1] ) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {3,-2,6,1,10,7};
		sort(arr);
		System.out.println(Arrays.toString(arr));
		

	}

}
