package problems;

import java.util.Arrays;

public class MoveZerosToEnd {
	
	public static void moveZeros(int arr[]) {
		//tracking element which are zero
		int count = 0;
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i] != 0) {
				int temp = arr[i];
				arr[i] = arr[count];
				arr[count] = temp;
				
				count++;
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {0,1,3,0,0,2,0,4};
		
		moveZeros(arr);
		System.out.println(Arrays.toString(arr));
	}

}
