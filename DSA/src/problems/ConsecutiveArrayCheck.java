package problems;

public class ConsecutiveArrayCheck {

	public static boolean consecutiveArrayCheck(int[] arr) {
		
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]+1 != arr[i+1]) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3};
//		int[] arr = {4,5,6,8};
		System.out.println(consecutiveArrayCheck(arr));
	}

}
