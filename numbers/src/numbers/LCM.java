package numbers;

import java.util.Scanner;

public class LCM {
	public static int lcmNum(int num1, int num2) {
		int lcm = 0;
		int high = (num1 > num2)? num1 : num2;
		for(int i = high ; i <= num1*num2 ;i++) {
			if(i % num1 == 0 && i % num2 == 0) {
				lcm = i;
				break;
			}
		}
		return lcm;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any two numbers: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int lcm = lcmNum(num1, num2);
		System.out.println("LCM of "+num1+" and "+num2+" is: "+lcm);

	}

}
