package oops;

import java.util.Scanner;

class Loan{
	 float p,t,si;
	 static float r;
	 
	 static {
		 r = 10.0f;
	 }
	 
	 void input() {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the principal amount: ");
		 p = sc.nextFloat();
		 System.out.println("Enter the time period: ");
		 t = sc.nextFloat();
	 }
	 void calcSI() {
		 si = (p * t * r)/100;
	 }
	 
	 void display() {
		 System.out.println("SI = "+si);
	 }
	 
	 
	 
 }
public class ApplicationOfStaticVariables {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Loan l1 = new Loan();
		l1.input();
		l1.calcSI();
		l1.display();
		
		Loan l2 = new Loan();
		l2.input();
		l2.calcSI();
		l2.display();
		
		Loan l3 = new Loan();
		l3.input();
		l3.calcSI();
		l3.display();
	}

}
