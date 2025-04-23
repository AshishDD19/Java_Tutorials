package patterns.using3rdVariable;
import java.util.Scanner;
class Pattern4  
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row value: ");
		int rows = sc.nextInt();
		int k = 1;
		System.out.println();
		for(int i=1;i<=rows;i++){
			for(int j=1;j<=i;j++){
				if(k % 2 == 0){
					System.out.print(0+" ");
				}
				else{
					System.out.print(1+" ");
				}

				k++;
			}
			System.out.println();
		}
		
		//or
		
		k = 1;
		System.out.println();
		for(int i=1;i<=rows;i++){
			for(int j=1;j<=i;j++){
				System.out.print( k % 2 +" ");
				k++;
			}
			System.out.println();
		}
		
		//for remainders of 5
		k = 1;
		System.out.println();
		for(int i=1;i<=rows;i++){
			for(int j=1;j<=i;j++){
				System.out.print( k % 5 +" ");
				k++;
			}
			System.out.println();
		}
	}
}
