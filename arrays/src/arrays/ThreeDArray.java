package arrays;
import java.util.Scanner;
class ThreeDArray 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Schools required: ");		
		int b = sc.nextInt();
		System.out.println("Enter the number of Classrooms required for each schools: ");		
		int r = sc.nextInt();
		System.out.println("Enter the number of Students in each classroom: ");
		int c = sc.nextInt();
		
		int arr[][][] = new int[b][r][c];
		
		for (int k=0;k < b ;k++)
		{
			for (int i=0; i<r ;i++){
		
				System.out.println("Enter marks of the students of School "+(k+1)+" in classroom "+(i+1)+": ");
				
				for (int j=0; j<c ;j++)
				{
					arr[k][i][j] = sc.nextInt();
				}
				
			}
		}
		
		//displaying
		System.out.println("Marks of the students are: ");
		for (int k=0;k < b ;k++)
		{
			for (int i=0; i<r ;i++){
				
				for (int j=0; j<c ;j++)
				{
					System.out.print(arr[k][i][j]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
