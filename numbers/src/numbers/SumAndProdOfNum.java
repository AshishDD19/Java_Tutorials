package numbers;

import java.util.Scanner;

public class SumAndProdOfNum {

	public static int AddNum(int num) {
		int sum = 0;
		while(num != 0) {
			int rem = num % 10;
			sum = sum + rem;
			num = num / 10;
		}
		return sum;
	}
	
	public static int ProdNum(int num) {
		int prod = 1;
		while(num != 0) {
			int rem = num % 10;
			prod = prod * rem;
			num = num / 10;
		}
		return prod;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int sum = AddNum(num);
		int prod = ProdNum(num);
		System.out.println("Sum of the digits of the number is: "+sum);
		System.out.println("Product of the digits of the number is: "+prod);
	}

}
