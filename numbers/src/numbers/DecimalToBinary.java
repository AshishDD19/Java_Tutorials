package numbers;

import java.util.Scanner;

public class DecimalToBinary {
	public static String deciToBin(int num) {
		return Integer.toBinaryString(num);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int number = sc.nextInt();
		System.out.println(deciToBin(number));
	}

}
