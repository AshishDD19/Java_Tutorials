package problems;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateFrom2DArray {

	public static void removeDup(int[][] arr) {
		Set<Integer> set  = new  LinkedHashSet<>();
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				set.add(arr[i][j]);
			}
		}
		
		for(int i:set) {
			System.out.print(i+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 2, 6, 3 }, { 5, 4, 5 }, { 1, 6, 2 } };
		removeDup(arr);
	}

}
