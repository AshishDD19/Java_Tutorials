package problems;

public class SearchElementInSortedMatrix {
	
	//time complexity is O(rows+cols)
	public static boolean searchElement(int[][] arr,int target) {
		int rows = arr.length;
		int cols = arr[0].length;
		
		int i = 0;
		int j = cols - 1;
		
		while(i<rows && j >= 0) {
			
			if(arr[i][j] == target) {
				System.out.println("Position is ("+i+","+j+")");
				return true;
			}
			
			else if(arr[i][j] > target) {
				j--; //move left
			}
			else {
				i++; //move down
			}
		}
		
		System.out.println("Element not found..!");
		return false;
		
	}
	
	
	 public static void main(String[] args) {
		int[][] arr = {{1,4,7,10},
					   {2,5,8,12},
					   {3,6,9,13}};
		
		int target = 9;
//		int target = 11;
		
		searchElement(arr, target);
		
	}
}
