package arrays;

public class MaxSumOfSubArrayKadanesAlgo {

	public static int maxSumSubArr(int arr[]) {
		int currSum = arr[0];
		int maxSum = arr[0];
		
		for(int i=1 ;i<arr.length;i++) {
			currSum = Math.max(arr[i], currSum + arr[i]);
			maxSum = Math.max(currSum, maxSum);
			
		}
		return maxSum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2, 3, -8, 7, -1, 2, 3};
		System.out.println(maxSumSubArr(arr));
	}

}
