package arrays;

import java.util.Arrays;

public class Check2ArraysEqual {
	public static boolean checkEqual(int arr1[], int arr2[]) {
		
		if(arr1.length != arr2.length) {
			return false;
		}
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i] != arr2[i] ) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {2,3,34,5,6,7};
		int arr2[] = {2,3,34,5,6,7};
		
		if(checkEqual(arr1, arr2)) {
			System.out.println("Both arrays are Equal");
		}
		else {
			System.out.println("Not Eqaul");
		}
		System.out.println(Arrays.equals(arr1, arr2));
	}

}
