package numbers;

import java.util.Scanner;

public class HCFandLCM {
	//hcf or gcd
	public static int hcf(int a,int b) {
		while(b!=0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}
	
	public static int lcm(int a,int b) {
		return a*b / hcf(a,b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any two numbers: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("HCF: "+hcf(num1, num2));
		System.out.println("LCM: "+lcm(num1, num2));
	}

}
