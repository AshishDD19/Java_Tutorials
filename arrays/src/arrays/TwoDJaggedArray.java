package arrays;
import java.util.Scanner;
class TwoDJaggedArray 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Classrooms required: ");		
		int r = sc.nextInt();
		
		int arr[][] = new int[r][];
		
		for(int i=0;i<r;i++){
			System.out.println("Enter the number of Students in Classroom "+(i+1)+": ");
			int c = sc.nextInt();
			arr[i] = new int[c];
		}
		
		for(int i=0;i < arr.length; i++){
			System.out.println("Enter the marks of Students in Classroom "+(i+1)+": ");
			for(int j=0; j < arr[i].length; j++){
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("Marks of the students are: ");
		for (int i=0; i < arr.length ; i++){
			for (int j=0; j < arr[i].length ; j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}
}
