package problems;

import java.util.TreeSet;

public class LongestConsecutiveSequenceTreeSet {

	public static int findLongSequence(int[] arr) {
		if(arr.length == 0) {
			return 0;
		}
		
		TreeSet<Integer> set = new TreeSet<>();
		
		for(int i : arr) {
			set.add(i);
		}
		
		int longest = 1;
		int currLen = 1;
		
		Integer prev = null;
		
		for(int num : set) {
			
			if(prev != null) {
				
				if(num == prev+1) {
					currLen++;
				}
				else {
					currLen = 1;
				}
			}
			longest = Math.max(longest, currLen);
			prev = num;
		}
		
		return longest;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {100,5,4,200,1,2,3};
		System.out.println(findLongSequence(arr));

	}

}
