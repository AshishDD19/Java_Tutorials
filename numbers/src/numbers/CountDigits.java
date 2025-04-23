package numbers;

import java.util.Scanner;

public class CountDigits {
	public static int count(int num) {
		int cnt = 0;
		while(num != 0) {

			num = num / 10;
			cnt++;
		}
		
		return cnt;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int cnt = count(num);
		System.out.println("No. of digits in "+num+" are: "+cnt);

	}

}
