package arrays;
import java.util.Arrays;
import java.util.Scanner;
class TwoDArray 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Classrooms required: ");		
		int r = sc.nextInt();
		System.out.println("Enter the number of Students in each classroom: ");
		int c = sc.nextInt();
		int i,j;
		
		int arr[][] = new int[r][c];
		for(i = 0;i < r;i++){
			System.out.println("Enter the students marks in Classroom "+(i+1)+" :");
			for(j = 0;j < c;j++){
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println(Arrays.deepToString(arr));
		System.out.println("Marks of the students are: ");
		for(i = 0;i < arr.length;i++){
			for(j = 0;j < arr[i].length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}
}
