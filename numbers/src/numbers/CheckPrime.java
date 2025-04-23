package numbers;


import java.util.Scanner;

public class CheckPrime {
	public static int checkPrime(int num) {
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
		System.out.println("Enter a value: ");
		int nums = sc.nextInt();
		int cnt = checkPrime(nums);
		if(cnt == 2) {
			System.out.println("It is a Prime no.");
		}
		else {
			System.out.println("Not a Prime no.");
		}
		
	}
}
