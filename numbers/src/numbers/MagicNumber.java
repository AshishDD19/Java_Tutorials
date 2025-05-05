package numbers;

import java.util.Scanner;

public class MagicNumber {
	
	public static boolean magicNoCheck(int num) {
	
//		while(num > 9) {
//			int sum = 0;
//			while(num > 0) {
//				sum += num % 10;
//				num = num/10;
//			}
//			num = sum;
//		}
//		return num == 1;
		
//		or
		
		return num % 9 == 1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no.: ");
		int num = sc.nextInt();
		
		if(magicNoCheck(num)) {
			System.out.println("It is a magic no.");
		}
		else {
			System.out.println("Not a magic no.");
		}
	}

}
