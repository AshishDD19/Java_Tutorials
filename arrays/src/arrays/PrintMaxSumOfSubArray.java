package arrays;

public class PrintMaxSumOfSubArray {
	
	public static void printMaxSumSubArr(int arr[]) {
		int maxSum = arr[0];
		int currSum = arr[0];
		
		int startIdx = 0;
		int endIdx = 0;
		int tempIdx = 0;
	
		
		for(int i = 1;i<arr.length;i++) {
			if(arr[i] > currSum + arr[i]) {
				currSum = arr[i];
				tempIdx = i;
			}
			else {
				currSum = currSum + arr[i];
			}
			
			if(currSum > maxSum) {
				maxSum = currSum;
				startIdx = tempIdx;
				endIdx = i;
			}
		}
		
		System.out.println("The sub array is: ");
		for(int i = startIdx; i<= endIdx;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Max sum of the sub-array is: "+maxSum);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2, 3, -8, 7, -1, 2, 3};
		printMaxSumSubArr(arr);
	}

}
