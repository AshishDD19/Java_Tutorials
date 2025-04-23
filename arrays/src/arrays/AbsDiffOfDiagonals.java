package arrays;

import java.util.Arrays;

public class AbsDiffOfDiagonals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = {{6,2,3},{4,9,6},{7,8,7}};
		
		int diag1 = 0;
		int diag2 = 0;
		
		System.out.println(Arrays.deepToString(arr));
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(i == j) {
					diag1 += arr[i][j];
				}
				if(i + j == arr.length-1) {
					diag2 += arr[i][j];
				}
			}
		}
		int diff = Math.abs(diag2 - diag1);
		
		System.out.println("The Absolute differnce of diaginals is: "+diff);
	}

}
