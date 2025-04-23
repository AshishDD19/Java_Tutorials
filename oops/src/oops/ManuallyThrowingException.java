package oops;

import java.util.Scanner;

public class ManuallyThrowingException {

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
				Exception e = new Exception();
				throw e;
			}
			else {
				c = a - b;
				System.out.println("Result: "+c);
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("Program terminated normally");
	}

}
