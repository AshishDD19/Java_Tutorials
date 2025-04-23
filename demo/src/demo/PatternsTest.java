
package demo;
import java.util.Scanner;
public class PatternsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of rows: ");
		int rows = sc.nextInt();
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=i;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=i;j++){
				System.out.print(i+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=i;j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=i;j++){
				System.out.print((char)(i+64)+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=i;j++){
				System.out.print((char)(j+64)+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for(int i=1;i<=rows;i++) {
			for(int j=rows;j>=(rows + 1 - i);j--){
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
