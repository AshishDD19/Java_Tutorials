package strings;

public class PrintAllSubstrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello";
		
		for(int i=0;i<str.length();i++) {
			for(int j=i ;j<str.length();j++) {
				System.out.println(str.substring(i, j+1));
			}
		}
		
		//or 
		System.out.println();
		
		for(int i=0;i<str.length();i++) {
			String res = "";
			for(int j=i ;j<str.length();j++) {
				res += str.charAt(j);
				System.out.println(res);
			}
		}
			
	}

}
