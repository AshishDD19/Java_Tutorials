package strings;

import java.util.Scanner;

public class PallindromCheck {
	
	public static String reverse(String str) {
		
		String res = "";
		
		for(int i =str.length()-1;i >=0;i--) {
			res = res + str.charAt(i);
		}
		
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		String res = reverse(str);
		
		if(res.equals(str)) {
			System.out.println("Its pallindrome");
		}
		else {
			System.out.println("Not pallindrome");
		}
	}

}
