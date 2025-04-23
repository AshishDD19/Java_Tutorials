package demo;

import java.util.Scanner;
class Max3Nums 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any three numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if (a>b)
		{
			if (a>c)
			{
				System.out.println("The largest number is: "+a);
			}
			else{
				System.out.println("The largest number is: "+c);
			}
		}
		else{
			if (b>c)
			{
				System.out.println("The largest number is: "+b);
			}
			else{
				System.out.println("The largest number is: "+c);
			}
		}
		System.out.println();
		
		//or
		
		if(a >= b && a >= c){
			System.out.println("The largest number is: "+a);
		}
		else if(b >= a && b >= c){
			System.out.println("The largest number is: "+b);
		}
		else{
			System.out.println("The largest number is: "+c);
		}
		
		//or using ternary operator
		
		System.out.println();
		int max = (a>b) ? ((a>c) ? a : c) : ((b>c) ? b : c);
		System.out.println("The largest number is: "+max);
	}
}
