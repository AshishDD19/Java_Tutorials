package strings;

import java.util.Arrays;

public class CheckAnagram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Listen";
		String s2 = "Silent";
		
		String s3 = s1.toLowerCase();
		String s4 = s2.toLowerCase();
		
		char arr1[] = s3.toCharArray();
		char arr2[] = s4.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		if(Arrays.equals(arr1, arr2)) {
			System.out.println("It's an Anagarm");
		}
		else {
			System.out.println("Not an Anagram");
		}
	}

}
