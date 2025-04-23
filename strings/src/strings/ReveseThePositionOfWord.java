package strings;

import java.util.Arrays;

public class ReveseThePositionOfWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str  = "Hi how are u?";
		String arr[] = str.split(" ");
		System.out.println(Arrays.toString(arr));
		for(int i= arr.length-1;i >= 0;i--) {
			System.out.print(arr[i] + " ");
		}
	}

}
