package numbers;

import java.util.Scanner;

public class HappyNum {
	
	public static int happyNumCheck(int num) {
		int res = 0;
		while(num !=0) {
			int rem = num % 10;
			res = res + rem*rem;
			num = num / 10; 
		}
		return res;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int res = happyNumCheck(num);
//		System.out.println(res);
		while(res != 1  && res != 4) {
			res = happyNumCheck(res);
			
//			System.out.println(res);
		}
		if(res == 1) {
			System.out.println("It is a Happy number");
		}
		else {
			System.out.println("Not a Happy number");
		}
		
//		System.out.println(res);
	}

}
