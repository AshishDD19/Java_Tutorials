package problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	
	public static int[] twoSum(int[] arr,int target) {
		Map<Integer,Integer> map = new HashMap<>();
		
		for(int i=0;i<arr.length;i++) {
			int complement = target - arr[i];
			
			if(map.containsKey(complement)) {
				return new int[] {map.get(complement),i};
			}
			map.put(arr[i], i);
		}
		
		return new int[] {-1,-1};
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = {2, 6, 5, 8, 11};
	     int target = 14;
	     
	     int[] res = twoSum(arr, target);
	     
	     System.out.println(Arrays.toString(res));
	}

}
