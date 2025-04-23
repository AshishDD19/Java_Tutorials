package strings;

public class LongestPallindromSubString {
	public static String reverse(String str) {
		String res = "";
		for(int i= str.length()-1;i>=0;i--) {
			res += str.charAt(i);
		}
		return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "malayalamaa";
		String longStr = "";
		
		for(int i=0;i<str.length();i++) {
			String res = "";
			for(int j=i ;j<str.length();j++) {
				res += str.charAt(j);
				if(res.equals(reverse(res))) {
					if( res.length() > longStr.length()) {
						longStr = res;
					}
				}
			}
		}
		
		System.out.println("Longest Pallindromic sub-string: ");
		System.out.println(longStr);

	}

}
