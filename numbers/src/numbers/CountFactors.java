package numbers;

import java.util.Scanner;

public class CountFactors {
	public static int countFactors(int num) {
		int count = 0;
		for(int i=1;i<=num; i++) {
			if(num % i == 0) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value for n");
		int nums = sc.nextInt();
		int cnt = countFactors(nums);
		System.out.println("No. of factors for "+nums+" is: "+cnt);
	}

}
