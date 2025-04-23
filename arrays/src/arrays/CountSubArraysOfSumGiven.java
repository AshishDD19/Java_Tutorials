package arrays;

import java.util.Scanner;

public class CountSubArraysOfSumGiven {

	public static int countSubArray(int arr[],int m) {
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				int sum = 0;
				for(int k=i;k<=j;k++) {
					sum = sum + arr[k];
				}
				if(sum == m) {
					count++;
				}
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,-3,0,7,1,-2,5};
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the sum required: ");
		int m = sc.nextInt();
		int count = countSubArray(arr, m);
		System.out.println("No. of sub-arrays whose sum is "+m+": "+count);

	}

}
