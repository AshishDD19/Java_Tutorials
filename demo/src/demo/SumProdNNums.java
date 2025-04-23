package demo;

import java.util.Scanner;
class SumProdNNums 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value for n: ");
		int n = sc.nextInt();
		int sum = 0, prod = 1;
		for(int i=1;i <= n;i++){
			sum = sum + i;
			prod = prod * i;
		}
		System.out.println("The Sum of first "+n+" no.s is: "+sum);
		System.out.println("The Product of first "+n+" no.s is: "+prod);
	}
}
