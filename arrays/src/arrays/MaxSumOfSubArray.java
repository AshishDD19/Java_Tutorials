package arrays;

public class MaxSumOfSubArray {
	
	public static void maxSumSubArray(int arr[]){
		
		int max = arr[0];
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i ; j<arr.length;j++) {
				int sum = 0;
				for(int k=i ;k <= j ;k++) {
					sum = sum + arr[k];
				}
				if(sum > max) {
					max = sum;
				}
			}
		}
		
		System.out.println("Maximum sum of the sub-array is: "+max);
	}
	
	//OR 
	
	public static void maxSumSubArray2(int arr[]) {
		int max = arr[0];
		
		for(int i=0;i<arr.length;i++) {
			int sum = 0;
			for(int j = i;j<arr.length;j++) {
				sum += arr[j];
				max = Math.max(max, sum);
			}
		}
		System.out.println("Maximum sum of the sub-array is: "+max);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2, 3, -8, 7, -1, 2, 3};
		maxSumSubArray(arr);
		maxSumSubArray2(arr);

	}

}
