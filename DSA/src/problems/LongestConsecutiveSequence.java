package problems;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class LongestConsecutiveSequence {

	public static int findLongSequence(int[] arr) {
		
		if(arr.length == 0) {
			return 0;
		}
		
		Set<Integer> set = new HashSet<>();
		for(int i: arr) {
			set.add(i);
		}
		
		int longest = 0;
		
		for(int num : set) {
			if(!set.contains(num - 1)) {
				int currLength = 1;
				int currNum = num;
				
				while(set.contains(currNum + 1)) {
					currNum++;
					currLength++;
				}
				
				longest = Math.max(currLength, longest);
			}
			
		}
		
		return longest;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {100,4,200,1,2,3};
		System.out.println(findLongSequence(arr));
	}

}
