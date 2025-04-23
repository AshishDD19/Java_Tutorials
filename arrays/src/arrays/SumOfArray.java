package arrays;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {12,23,34,45,56,67,78};
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum = sum + arr[i];
		}
		System.out.println("Sum of the elemnts in the array is: "+sum);
		
	}

}
