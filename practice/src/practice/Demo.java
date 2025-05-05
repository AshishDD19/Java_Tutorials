package practice;

import java.time.Duration;
import java.time.Instant;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instant start  = Instant.now();
	
		int rows = 7;
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=rows;j++) {
				if(i == 1 || i == rows || j==1 || j == rows|| i==j || i+j == rows+1 || i == (rows+1)/2 ) {
					System.out.print("*"+" ");
				}else {
					System.out.print(" "+" ");
				}
				
				
			}
			System.out.println();
		}

		
		Instant end  = Instant.now();
		Duration d = Duration.between(start, end);
		System.out.println(d);
		
	}

}
