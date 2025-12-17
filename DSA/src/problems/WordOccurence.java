package problems;

import java.util.Arrays;

public class WordOccurence {	
	
	public static int wordOcc(String str, String word) {
		int count = 0;
		
		String newStr = str.toLowerCase().replaceAll("[^a-z0-9 ]", "");
		System.out.println(newStr);
		String[] arr = newStr.split("\\s+");
		System.out.println(Arrays.toString(arr));
		
		
		for(String s: arr) {
			if(s.equals(word)) {
				count++;
			}
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		String str = "Java is programming  Language.  java is   great!.  java is powerfull? ";
		String word = "java";
		
		System.out.println(wordOcc(str, word));
		
	}
}
