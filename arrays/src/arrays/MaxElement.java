package arrays;

public class MaxElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {12,24,98,23,55};
		int max = arr[0];
		for(int i = 0;i<arr.length;i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("Maximum element is: "+max);
		
	}

}
