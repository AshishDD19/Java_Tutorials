package numbers;

import java.util.Scanner;

public class BinrayToDecimal {

	public static int binToDeci(String binary) {
		return Integer.parseInt(binary, 2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the binary no.:");
		String binary = sc.next();
		System.out.println(binToDeci(binary));
	}

}
