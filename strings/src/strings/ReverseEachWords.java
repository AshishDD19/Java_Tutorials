package strings;

import java.util.Arrays;

public class ReverseEachWords {
	
	public static String reverse(String str) {
		String res = "";
		for(int i= str.length()-1; i>=0;i--) {
			res = res + str.charAt(i);
		}
		return res;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str  = "Hi how are u?";
		String arr[] = str.split(" ");
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length;i++) {
			System.out.print(reverse(arr[i]) + " ");
		}
	}

}
