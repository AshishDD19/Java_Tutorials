package practice;

public class MaxElement {

	static int maxEle(int arr[]) {
		
		int max = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {9,-21,6,8,13,3,2,10};
		System.out.println(maxEle(arr));
	}

}
