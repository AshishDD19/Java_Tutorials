package practice;

import java.util.Arrays;

public class StringInterviewQuestion {
	
	public static int solution(String letters) {
		int[] lastLower = new int[26];
		int[] firstUpper = new int[26];
	
		for(int i=0;i<26;i++) {
			lastLower[i] = -1;
			firstUpper[i] = -1;
		}
		
		for(int i=0;i<letters.length();i++) {
			char ch = letters.charAt(i);
			if(ch >= 'a' && ch <= 'z') {
				lastLower[ch - 'a'] = i;
			}
			
			else if(ch >= 'A' && ch <= 'Z') {
				if(firstUpper[ch - 'A'] == -1) {
					firstUpper[ch - 'A'] = i;
				}
				
			}
		}
		
		int count = 0;
		for(int i=0;i<26;i++) {
			if(lastLower[i] != -1 && firstUpper[i] != -1) {
				if(lastLower[i] < firstUpper[i]) {
					count++;
				}
			}
		
		}
		System.out.println(Arrays.toString(lastLower));
		System.out.println(Arrays.toString(firstUpper));
		
		return count;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "xyzXYZabcABC";
		int count = solution(str);
		System.out.println(count);
		
	}

}
