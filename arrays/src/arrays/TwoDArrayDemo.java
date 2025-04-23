package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 4;
		int cols = 3;
		int arr[][] = new int[rows][cols];
		Scanner sc = new Scanner(System.in);
		System.out.println(Arrays.deepToString(arr));
		System.out.println("Enter the elements: ");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println(Arrays.deepToString(arr));
		System.out.println("In Matix format: ");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
