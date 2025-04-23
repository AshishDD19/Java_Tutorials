package arrays;

import java.util.Scanner;

public class LinearSearch {

	public static int linearSearch(int arr[],int key) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == key) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {20,30,40,32,17,21};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the key value to search: ");
		int key = sc.nextInt();
		int idx = linearSearch(arr, key);
		
		if(idx > -1) {
			System.out.println("Element is in "+idx+" index position.");
		}
		else {
			System.out.println("Element not found!");
		}
	}

}
