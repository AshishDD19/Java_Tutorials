package patterns;
import java.util.Scanner;
class NumPattern3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value for n: ");
		int n = sc.nextInt();
		System.out.println();
		for(int i=1;i <= n;i++){
			for(int j=1;j <= n;j++){
				System.out.print(i+j+" ");
			}
			System.out.println();
		}
	}
}
