package numbers;

import java.util.Scanner;
class EvenAndOdd 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value for n");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++){
			if(i%2!=0){
				System.out.print(i+" ");
			}
			else{
				System.out.println(i);
			}	
		}

	}
}