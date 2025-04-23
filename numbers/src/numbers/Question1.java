package numbers;

import java.util.Scanner;


//Given an integer N, returns the smallest integer greater than N,
//the sum of whose digits is twice as the sum of the digits of N

public class Question1 {
	
	public static int sumDigits(int num) {
		int res = 0;
		while(num != 0) {
			res = res + num%10;
			num = num / 10;
			
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int sum1 = sumDigits(num);
		int num2 = num+1;
		while(sum1*2 != sumDigits(num2)) {
			num2++;
		}
		System.out.println(num2);
		
	}

}
