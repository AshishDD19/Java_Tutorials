package patterns;
import java.util.Scanner;
class NumPattern5 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of rows: ");
		int rows = sc.nextInt();
		for (int i=0;i<=rows ;i++)
		{
			for (int j=i; j >= 1 ;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
