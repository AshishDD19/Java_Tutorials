package oops;

import java.util.Scanner;


class ALessThanBException extends Exception{
	public String getMessage() {
		return "a - b is negative, Subtraction not possible";
	}
}

public class CustomExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of a: ");
		int a = sc.nextInt();
		System.out.println("Enter value of b: ");
		int b = sc.nextInt();
		int c;
		
		try {
			if(a<b) {
				ALessThanBException e = new ALessThanBException();
				throw e;
			}
			else {
				c = a - b;
				System.out.println("Result: "+c);
			}
		}
		
		catch(ALessThanBException e) {
			
			//Exception class n methods
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Program terminated normally");
	}

}
