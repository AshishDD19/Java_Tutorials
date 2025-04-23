package numbers;

import java.util.Scanner;

public class PrintPallindorme {
	
	public static int revNum(int num) {
		int res = 0;
		while(num != 0) {
			int rem = num % 10;
			res = (res*10) + rem;
			num = num / 10;
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number until which pallindrome no.s should be printed: ");
		int num = sc.nextInt();
		for(int i=1;i <= num; i++) {
			int res = revNum(i);
			if(i == res) {
				System.out.println(i);
			}
			
		}
		
	}

}
