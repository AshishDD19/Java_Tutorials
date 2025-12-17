package problems;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortByValueInHashMapUsingStream {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new LinkedHashMap<>();
		map.put("B", 234);
		map.put("A", 34);
		map.put("D", 41);
		map.put("C", 14);
		
		
		LinkedHashMap<String, Integer> res = 
				
				map.entrySet().stream()
				.sorted(Map.Entry.comparingByValue())
				.collect(Collectors.toMap(Map.Entry::getKey	, Map.Entry::getValue, 
						(oldVal,newVal) -> oldVal, LinkedHashMap::new));
		
		System.out.println(res);
		
		
		
		
		
		
		
		
		
	}
}
