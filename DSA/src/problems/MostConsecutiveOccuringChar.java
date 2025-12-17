package problems;

public class MostConsecutiveOccuringChar {

	public static void mostOccurence(String str) {

		if (str == null || str.length() == 0) {
			System.out.println("String is empty!");
		}

		int currLen = 0;
		char currChar = str.charAt(0);
		
		int maxLen = 0;
		char maxChar = str.charAt(0);
		
		for(int i=1;i<str.length();i++) {
			
			if(currChar == str.charAt(i)) {
				currLen++;
			}else {
				currChar = str.charAt(i);
				currLen = 1;
			}
			
			if(currLen > maxLen) {
				maxLen = currLen;
				maxChar = currChar;
			}
		}
		
		System.out.println(maxChar+" "+maxLen);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aabbbcc";
//		String str = "aaccccbbddd";
		
		mostOccurence(str);

	}

}
