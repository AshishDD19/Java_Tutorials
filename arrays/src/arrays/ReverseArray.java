package arrays;
import java.util.Arrays;
import java.util.Scanner;
class ReverseArray 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		System.out.println("Enter the elements: ");
		for (int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Array values: ");
		for (int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		//reversing
		for (int i=0; i < arr.length/2 ; i++){
			int temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}
		System.out.println("Reversed array : ");
		System.out.println(Arrays.toString(arr));
		
		//or
		
		int i = 0;
		int j = arr.length -1;
		while(i<=j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		
		System.out.println("Reversed array again: ");
		System.out.println(Arrays.toString(arr));
	}
}
