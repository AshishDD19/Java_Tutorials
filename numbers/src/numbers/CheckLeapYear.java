package numbers;

import java.util.Scanner;

public class CheckLeapYear {

	public static boolean checkLeap(int year) {
		return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year:");
		int year = sc.nextInt();
		if(checkLeap(year)) {
			System.out.println("Leap year");
		}
		else {
			System.out.println("Not a leap year");
		}

	}

}
