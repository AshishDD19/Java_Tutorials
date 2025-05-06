package arrays;

import java.util.Scanner;

public class BinarySearch {
	
	public static int binarySearch(int arr[],int key) {
		int low = 0;
		int high = arr.length-1;
		
		while(low <= high) {
			int mid = (low + high)/2;
			
			if(key == arr[mid]) {
				return mid;
			}
			else if(key > arr[mid]) {
				low = mid + 1;
			}
			else {
				high = mid - 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4,9,12,23,32,45};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the key value to search: ");
		int key = sc.nextInt();
		int idx = binarySearch(arr, key);
		System.out.println(idx);
		if(idx > -1) {
			System.out.println("Element is in "+idx+" index position.");
		}
		else {
			System.out.println("Element not found!");
		}
	
	}

}
