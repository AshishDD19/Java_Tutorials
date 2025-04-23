package numbers;

import java.util.Scanner;

public class HCF {
	
	public static int hcfNum(int num1,int num2) {
		int small = (num1 < num2)? num1 : num2;
		int hcf = 1;
		for(int i=1;i<=small;i++) {
			if(num1 % i == 0 && num2 % i == 0) {
				hcf = i;
			}
		}
		return hcf;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any two numbers: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int hcf = hcfNum(num1, num2);
		System.out.println("HCF of "+num1+" and "+num2+" is: "+hcf);

	}

}
