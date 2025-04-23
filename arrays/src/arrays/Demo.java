package arrays;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = new int[5];
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		//or for printing
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println("After updating");
		
		arr[1] = 57;
		
		System.out.println(Arrays.toString(arr));

		
		
		
	}

}
