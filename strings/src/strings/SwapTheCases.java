package strings;

public class SwapTheCases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "PenTaGon SpacE";
		String res = "";
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch >= 97 && ch <= 122) {
				res = res + (char)(ch - 32);
			}
			else if(ch == ' ') {
				res = res + ' ';
			}
			else {
				res = res + (char)(ch+32);
			}
		}
		
		System.out.println(res);
	}

}
