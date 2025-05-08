package arrays;

public class FindMissingNoInArray {
	public static int findMissingNo(int arr[]) {
		int n = arr.length + 1;
		int sumOfNaturalNos = (n * (n + 1) )/2;
		int arrSum = 0;
		for(int i : arr) {
			arrSum += i;
		}
		
		return sumOfNaturalNos - arrSum;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,4,1,3,5,8,6,10,9};
		
		System.out.println("Missing no. in the array is "+findMissingNo(arr));
		
	}

}
