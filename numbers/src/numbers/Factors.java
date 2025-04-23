package numbers;

import java.util.Scanner;

public class Factors {
	
	public static void printFactors(int nums) {
		for(int i=1;i<=nums;i++){
			if( nums % i == 0){
				System.out.print(i+" ");
			}	
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value for n");
		int nums = sc.nextInt();
		printFactors(nums);

	}

}
