package strings;

public class CheckOnlyDigits {

	public static boolean checkDigits(String str) {
		return str.matches("\\d+");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checkDigits("12a45"));
		System.out.println(checkDigits("12345"));
		

	}

}
