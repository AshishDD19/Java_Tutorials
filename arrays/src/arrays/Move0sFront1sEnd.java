package arrays;

import java.util.Arrays;

public class Move0sFront1sEnd {
	public static int[] move(int arr[]) {
		int i=0;
		int low = 0;
		int high = arr.length-1;
		
		while(i<=high) {
			if(arr[i] == 0) {
				int temp = arr[i];
				arr[i] = arr[low];
				arr[low] = temp;
				low++;
				i++;
			}
			else if(arr[i] == 1){
				int temp = arr[i];
				arr[i] = arr[high];
				arr[high] = temp;
				high--;
			}
			else {
				i++;
			}
		}
		
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3, 0, 4, 1, 2, 0, 5, 1, 0, 6};
		System.out.println(Arrays.toString(arr));
		
		int res [] = move(arr);
		System.out.println(Arrays.toString(res));
	}

}
