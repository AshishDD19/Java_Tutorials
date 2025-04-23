package demo;

import java.util.Scanner;
class ScannerClassEx 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value for a: ");
		int a = sc.nextInt();
		System.out.println("Enter a value for b: ");
		int b = sc.nextInt();
		int c = a + b;
		System.out.println("Sum of "+a+" and "+b+" is: "+c);
		
	}
}
