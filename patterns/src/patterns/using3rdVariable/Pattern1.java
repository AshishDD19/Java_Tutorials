package patterns.using3rdVariable;
import java.util.Scanner;
class Pattern1  
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a row value: ");
		int rows = sc.nextInt();
		int k = 1;
		System.out.println();
		for(int i=1;i<=rows;i++){
			for(int j=1;j<=i;j++){
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}
	}
}
