package sortingAlgo;

public class CheckArraySorted {
	public static boolean checkSort(int arr[]) {
		for(int i=0; i < arr.length-1 ;i++) {
			if(arr[i] > arr[i+1]) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,3,4,4,5,6,7};
		if(checkSort(arr)) {
			System.out.println("Sorted");
		}
		else {
			System.out.println("Not Sorted");
		}
	}

}
