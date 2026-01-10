package problems;


//Given an array nums of size n, return the majority element.
//The majority element is the element that appears more than (n / 2) times.
//You may assume that the majority element always exists in the array.


public class MajorityElement {
	
	public static int findMajority(int arr[]) {
		int vote = 1;
		int candidate = arr[0];
		
		for(int i=1;i<arr.length;i++) {
			if(vote == 0) {
				vote = 1;
				candidate = arr[i];
			}
			else if(candidate == arr[i]) {
				vote++;
			}
			else {
				vote--;
			}
		}
		
		return candidate;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr = {2,2,3,1,4,2,2};
		int[] arr = {2,2,1,1,1,2,2};
		System.out.println(findMajority(arr));
	}

}
