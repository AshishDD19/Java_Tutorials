package arrays;

public class SearchArrayDiffBtwnAdj1 {
	public static int search(int arr[] , int key) {
		int i = 0;
		while(i < arr.length) {
			if(arr[i] == key) {
				return i; 
			}
			
			i = i + Math.abs(arr[i] - key);
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4, 5, 6, 7, 6, 5, 4, 3, 2, 3, 4};
		int key = 2;
		
		int idx = search(arr, key);
		if(idx != -1) {
			System.out.println("Element is found on "+idx+" position.");
		}
		else {
			System.out.println("Element not found!");
		}
	}

}
