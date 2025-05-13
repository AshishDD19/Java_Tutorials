package numbers;

import java.util.Scanner;

public class CheckPrimeDiffMethod {

	public static boolean isPrime(int num) {
		
		if(num <=1) {
			return false;
		}
		for(int i = 2 ;i <= Math.sqrt(num);i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		if(isPrime(num)) {
			System.out.println("It is prime no.");
		}
		else {
			System.out.println("Not a prime.");
		}
		
	}

}
