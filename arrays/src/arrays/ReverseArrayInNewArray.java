package arrays;

import java.util.Arrays;

public class ReverseArrayInNewArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {11,21,34,45,56,67,78,66,97};
		int res[] = new int[arr.length];
		int k = arr.length - 1;
		for(int i=0;i<arr.length;i++) {
			res[k] = arr[i];
			k--;
		}
		System.out.println(Arrays.toString(res));
	
 		
	}

}
