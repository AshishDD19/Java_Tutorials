package arrays;

public class AvgOfOddNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {11,21,34,45,56,67,78,97};
		int sum = 0;
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2 != 0) {
				sum = sum + arr[i];
				count++;
			}
			
		}
		System.out.println("Avg of odd elemnts in the array is: "+(float)(sum/count));
		

	}

}
