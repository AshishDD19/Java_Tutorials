package strings;

public class WordCount {

	public static int countWords(String str) {
		int count = 0;
		if(str.length() != 0) {
			return str.split(" ").length;
		}
		
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Welcome to java class";
		System.out.println(countWords(str));

	}

}
