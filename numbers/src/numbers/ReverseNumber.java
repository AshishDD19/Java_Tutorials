package numbers;

import java.util.Scanner;

public class ReverseNumber {

	public static int revNum(int num) {
		int res = 0;
		while(num != 0) {
			int rem = num % 10;
			res = (res*10) + rem;
			num = num / 10;
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int res = revNum(num);
		System.out.println("The reversed number is: "+res);
	}

}
