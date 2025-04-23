package arrays;
import java.util.Scanner;
import java.util.Arrays;
class ArrayDemo 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of students required: ");
		int n = sc.nextInt();
		System.out.println("Enter the marks: ");
		int arr[] = new int[n];
		for(int i=0;i<=n-1;i++){
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<=n-1 ;i++){
			System.out.println("Marks of Student "+(i+1)+": "+arr[i]);
			
		}
		System.out.println(Arrays.toString(arr));
		System.out.println();
	}
}
