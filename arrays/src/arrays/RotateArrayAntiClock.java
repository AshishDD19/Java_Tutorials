package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArrayAntiClock {
	
	public static void rotateArray(int arr[]) {
		int temp = arr[0];
		for(int i=1;i<arr.length;i++) {
			arr[i-1] = arr[i];
		}
		
		arr[arr.length-1] = temp;
		
//		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {21,45,78,63,54,3};
		System.out.println("Before rotation: "+Arrays.toString(arr));
//		rotateArray(arr);
//		System.out.println("After rotation: "+Arrays.toString(arr));
		
		//rotate n times
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how may times to rotate: ");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			rotateArray(arr);
			System.out.println("Rotation "+i+": "+Arrays.toString(arr));
			
		}
	}

}
