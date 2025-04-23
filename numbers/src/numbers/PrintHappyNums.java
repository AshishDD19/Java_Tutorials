package numbers;

import java.util.Scanner;

public class PrintHappyNums {
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
		System.out.println("Enter a range until the nos should be printed: ");
		int num = sc.nextInt();
		System.out.println("Deserium no.s until "+num+" are:");
		for(int i=1;i<=num;i++) {
			int res = happyNumCheck(i);
			while(res != 1  && res != 4) {
				res = happyNumCheck(res);
				
			}
			if(res == 1) {
				System.out.println(i);
			}
		}
	}

}
