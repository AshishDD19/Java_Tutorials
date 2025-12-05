package strings;

public class FindLongestWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Welcome to Pentagon Space malayalam";
		String arr[] = str.split(" ");
		int max = arr[0].length();
		String res = null;
		for(int i=0;i<arr.length;i++) {
			if(arr[i].length() > max) {
				max = arr[i].length();
				 res = arr[i];
			}
		}
		System.out.println(res);
	}

}
