package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreesMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {2,3,4,1,2,5,2,4,6,4,3,1};
		HashMap<Integer, Integer> m = new HashMap<Integer,Integer>();
		
		for(int i : arr) {
			if(m.containsKey(i)) {
				m.put(i, m.get(i) + 1);
			}
			else {
				m.put(i, 1);
			}
		}
		
		Set<Map.Entry<Integer, Integer>> s = m.entrySet();
		
		for(Map.Entry<Integer, Integer> itr : s) {
			
			System.out.println(itr.getKey()+ " "+itr.getValue());
		}
		
		
		System.out.println("Duplicate values: ");
 		for(Integer key : m.keySet()) {
 			if(m.get(key) > 1) {
 				System.out.print(key + " ");
 			}
 		}
		System.out.println();
 		System.out.println("Removed duplicates: "+m.keySet());
		
		
		
	}

}
