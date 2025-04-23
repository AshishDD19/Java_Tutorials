package strings;

public class CheckAnagram2 {
	
	//converting to lower case
	public static String toLower(String str) {	
		String res = "";
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch >= 65 && ch <= 90) {
				res = res + (char)(ch + 32);
			}
			else {
				res = res + ch;
			}
		}
		return res;
	}
	
	//converting string to array
	public static char [] stringToArray(String str) {
		char arr [] = new char[str.length()];
		
		for(int i=0;i<str.length();i++) {
			arr[i] = str.charAt(i);
		}
		return arr;
	}
	
	//Sorting the array
	public static void bubbleSort(char arr[]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j] > arr[j+1]) {
					char temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	//check whether both arrays are equal
	public static boolean checkEquals(char arr1[], char arr2[]) {
		if(arr1.length != arr2.length) {
			return false;
		}
		
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i] != arr2[i]) {
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Silent";
		String s2 = "Listen";
		
		String s3 = toLower(s1);
		String s4 = toLower(s2);
		
		char arr1[] = stringToArray(s3);
		char arr2[] = stringToArray(s4);
		
		bubbleSort(arr1);
		bubbleSort(arr2);
		
		if(checkEquals(arr1, arr2)) {
			System.out.println("It's an Anagram");
		}
		else {
			System.out.println("Not an Anagram");
		}
		
		
	}

}
