package arrays;

import java.util.Arrays;

public class SmallestSubArrayOfGivenSum {

	public static int smallSubArray(int arr[],int k){
		int min = arr.length;
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				int sum = 0;
				int n = 0;
				int[] res = new int[j+1-i];
				for(int m = i;m<=j;m++) {
					sum += arr[m];
					res[n] = arr[m];
					n++;
					
				}
				System.out.println(Arrays.toString(res));
				
				if(sum >= k) {
					if(res.length < min) {
						min = res.length;
					}
				}
			}
		}
		return min;
	}
	
	public static int smallSubArray2(int arr[],int k){
		int min = arr.length;
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				int sum = 0;
				int length = 0;
			
				for(int m = i;m<=j;m++) {
					sum += arr[m];
					length++;
					
				}
				
				
				if(sum >= k) {
					if(length < min) {
						min = length;
					}
				}
			}
		}
		return min;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,1,2,4,3};
		System.out.println(smallSubArray(arr,7));
		System.out.println(smallSubArray2(arr,7));
		
	}

}
