package patterns;
import java.util.Scanner;
class SquarePattern
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value for no. of rows: ");
		int rows = sc.nextInt();
		for(int i=1;i<=rows;i++){
			for(int j=1;j<=rows;j++){
				if(i == 1 || i == rows || j == 1 || j == rows || i==j || j == rows+1-i || i==(rows+1)/2 || j==(rows+1)/2){
					System.out.print("*"+" ");
				}
				else{
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
	}
}
