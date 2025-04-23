package numbers;

import java.util.Scanner;

public class OddAndEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value for n");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++){
			if(i%2!=0){
				System.out.print(i+" ");
			}
			else{
				System.out.println(i);
			}	
		}
	}

}
