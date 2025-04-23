package strings;

import java.util.Arrays;

public class StringToCharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Pentagon";
		char arr[] = new char[str.length()];
		
		for(int i=0;i<str.length();i++) {
			arr[i] = str.charAt(i);
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
