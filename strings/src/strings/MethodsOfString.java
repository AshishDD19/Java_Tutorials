package strings;

import java.util.Arrays;

public class MethodsOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Pentagon";
		
		//string to char array
		char arr[] = str.toCharArray();
		System.out.println(Arrays.toString(arr));
		
		//uppercase
		System.out.println(str.toUpperCase());
		
		//lowercase
		System.out.println(str.toLowerCase());
		
		//length of string
		System.out.println(str.length());
		
		//to compare 2 string
		String str1 = "College";
		System.out.println(str.equals(str1));
	}

}
