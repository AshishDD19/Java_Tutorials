package numbers;

import java.util.Scanner;


public class AmstrongNum {
	
	public static int count(int num) {
		int cnt = 0;
		while(num != 0) {

			num = num / 10;
			cnt++;
		}
		
		return cnt;
	}
	
	public static int amstrongCheck(int num) {
		int res = 0;
		int n = count(num);
		while(num != 0) {
			int rem = num % 10;
			res = res + (int)Math.pow(rem,n );
			num = num / 10;
		}
		
		return res;
	}
	

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int res = amstrongCheck(num);
		System.out.println(res);
		if(num == res) {
			
			System.out.println("It's a Amstrong number");
		}
		else {
			System.out.println("It's not a Amstrong number");
		}
		
	}

}
