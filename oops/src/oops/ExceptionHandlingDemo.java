package oops;

import java.util.Scanner;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value for a: ");
		int a = sc.nextInt();
		System.out.println("Enter a vlue for b: ");
		int b = sc.nextInt();
		int c;
		
		try {
			c = a/b;
			System.out.println("Result: "+c);	
		}
		
		catch(ArithmeticException e) {
	
			System.out.println("Can't divide by zero");
			System.out.println("Exception handled successfully");
		}
		
		System.out.println("Program terminated normally");
		

	}

}
