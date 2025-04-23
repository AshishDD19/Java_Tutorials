package strings;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Tokenization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String s1 = sc.next();
		
		System.out.println("Enter the character(s) where tokenization is to be performed: ");
		String s2 = sc.next();
		
		StringTokenizer stk = new StringTokenizer(s1,s2);
		while(stk.hasMoreTokens()) {
			System.out.println(stk.nextToken());
		}
	}

}
