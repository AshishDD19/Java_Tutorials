package strings;

public class LargestSmallestWord {
	
	public static void largeSmall(String str) {
		String arr[] = str.split(" ");
		String small = arr[0];
		String large = arr[0];
		
		for(int i=0;i<arr.length;i++){
			if(arr[i].length() > large.length()) {
				large = arr[i];
			}
			if(arr[i].length() < small.length()) {
				small = arr[i];
			}
		}
		
		System.out.println("Large: "+large);
		System.out.println("Small: "+small);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Java programming language is awesome";
		
		largeSmall(str);
		
	}

}
