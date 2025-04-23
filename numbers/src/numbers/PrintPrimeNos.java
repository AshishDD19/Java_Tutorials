package numbers;

import java.util.Scanner;

public class PrintPrimeNos {

	public static int checkPrime(int num) {
		int count = 0;
			for(int i=1;i<=num; i++) {
				if(num % i == 0) {
				count++;
			}
		}
		return count;
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a range until prime no.s should be printed : ");
		int nums = sc.nextInt();
		int count = 0;
		float sum = 0;

			for(int i=1; i<=nums ;i++) {
				int cnt = checkPrime(i);
				if(cnt == 2) {
						sum = sum + i;
						count++;
			
				}
			}
			float avg = sum/50;
			System.out.println("Average of first 50 prime no.s is :"+avg);
		
		


			
	}

}
