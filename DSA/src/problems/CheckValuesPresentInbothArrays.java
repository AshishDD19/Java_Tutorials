package problems;

public class CheckValuesPresentInbothArrays {
	
	public static boolean checkValue(int arr1[], int arr2[]) {

		for (int i = 0; i < arr2.length; i++) {   // loop arr2
			boolean found = false;

			for (int j = 0; j < arr1.length; j++) {  // loop arr1
				if (arr2[i] == arr1[j]) {
					found = true;
					break;
				}
			}

			// if any one element of arr2 is not present in arr1
			if (!found) {
				return false;
			}
		}

		return true;  // all elements found
	}

	public static void main(String[] args) {

		int arr1[] = {1,2,1,3,2};
		int arr2[] = {1,2,3,4};
		
		System.out.println(checkValue(arr1, arr2));
		
	}
}
