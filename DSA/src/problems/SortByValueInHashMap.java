package problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SortByValueInHashMap {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new LinkedHashMap<>();
		map.put("B", 234);
		map.put("A", 34);
		map.put("D", 41);
		map.put("C", 14);
		
		List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
		
		Collections.sort(list, (a,b) -> a.getValue().compareTo(b.getValue()));
		
		HashMap<String, Integer> res = new LinkedHashMap<>();
		
		for(Map.Entry<String, Integer> val : list) {
			res.put(val.getKey(), val.getValue());
		}
		
		System.out.println(res);
	}
	
}
