package arrays;

import java.util.HashMap;

public class FindDupliUsingHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {12,34,43,12,34,55,34,45,66,55};
		
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i : arr) {
			if(map.containsKey(i)) {
				map.put(i , map.get(i) + 1);
			}
			else {
				map.put( i , 1);
			}
		}
		System.out.println(map);
				
		System.out.println("The duplicate values are: ");
		
		for(Integer key : map.keySet()) {
			
			if(map.get(key) > 1) {
				System.out.println(key);
			}
		}
		
		System.out.println("The Non-duplicate values are: ");
		
		for(Integer key : map.keySet()) {
			
			if(map.get(key) == 1) {
				System.out.println(key);
			}
		}
		
		System.out.println("Remove duplicates and print :");
		System.out.println(map.keySet());
	}

}
