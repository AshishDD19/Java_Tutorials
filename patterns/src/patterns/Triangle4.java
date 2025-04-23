package patterns;
import java.util.Scanner;
class Triangle4 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. if rows: ");
		int rows = sc.nextInt();
		for(int i=1; i<=rows ; i++){
			for(int j=1;j <= rows-i ; j++){
				System.out.print(" "+" ");
			}
			for(int j=rows; j >= rows+1-i ;j--){
				System.out.print(j+" ");
			}
			for(int j=rows+2-i;j <= rows ;j++){
				System.out.print(j+" ");
			}
			System.out.println();			
		}
	}
}
