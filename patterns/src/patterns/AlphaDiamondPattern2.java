package patterns;
import java.util.Scanner;
class AlphaDiamondPattern2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of rows: ");
		int rows = sc.nextInt();
		for(int i=1; i<=rows ; i++){
			for(int j=1;j <= rows-i ; j++){
				System.out.print(" "+" ");
			}
			for(int j= i ; j >= 1 ;j--){
				System.out.print((char)(64+j)+" ");
			}
			for(int j = 2 ;j <= i ;j++){
				System.out.print((char)(64+j)+" ");
			}
			System.out.println();			
		}
		
		for(int i = rows-1; i>= 1 ; i--){
			for(int j=1;j <= rows-i ; j++){
				System.out.print(" "+" ");
			}
			for(int j= i ; j >= 1 ;j--){
				System.out.print((char)(64+j)+" ");
			}
			for(int j = 2 ;j <= i ;j++){
				System.out.print((char)(64+j)+" ");
			}
			System.out.println();			
		}
	}
}
