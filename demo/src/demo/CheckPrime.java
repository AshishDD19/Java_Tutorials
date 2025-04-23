package demo;

import java.util.Scanner;
class CheckPrime 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		int count = 0;
		if(n < 1){
			System.out.println("Not a prime number");
		}
		else{
			for(int i=1;i <= n;i++){
				if(n % i == 0){
					count++;
				}
			}
			if(count == 2){
				System.out.println("It is Prime number");
			}
			else{
				System.out.println("Not a prime number");
			}
			
		}

	}
}
