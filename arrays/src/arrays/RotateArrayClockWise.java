package arrays;

import java.util.Arrays;

public class RotateArrayClockWise {

	public static void rotateArray(int arr[]) {
		int temp = arr[arr.length - 1];
		for(int i=arr.length-2;i>=0;i--) {
			
			arr[i+1] = arr[i];

		}
		arr[0] = temp;
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5};
		System.out.println("Before rotation: "+Arrays.toString(arr));
		System.out.println("After roation:  ");
		rotateArray(arr);

	}

}
