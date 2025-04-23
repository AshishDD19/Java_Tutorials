package strings;

import java.util.Scanner;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "pentagon";
		System.out.println(s.charAt(4));
		
		for(int i=0;i<s.length();i++) {
			System.out.println(s.charAt(i));
		}
		
		Scanner sc = new Scanner(System.in);
		String s1  = sc.next();
		System.out.println(s1);
		
		String s2 = sc.nextLine();
		System.out.println(s2);
		
		
	}

}
