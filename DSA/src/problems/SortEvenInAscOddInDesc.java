package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortEvenInAscOddInDesc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 23, 5, 56, 34, 1, 2, 3, 36 };

//		List<Integer> even = new ArrayList<>();
//		List<Integer> odd = new ArrayList<>();
//		
//		for(int i:arr) {
//			if(i % 2 == 0) {
//				even.add(i);
//			}
//			else {
//				odd.add(i);
//			}
//			
//		}
//		
//		Collections.sort(even);
//		Collections.sort(odd, Collections.reverseOrder());
		
		//stream
		
		List<Integer> even = Arrays.stream(arr)
									.filter(x -> x % 2 == 0)
									.sorted()
									.boxed()// to convert int -> Integer
									.collect(Collectors.toList());
		
		List<Integer> odd = Arrays.stream(arr)
									.filter(x -> x % 2 != 0)
									.boxed()
									.sorted(Comparator.reverseOrder())
									.collect(Collectors.toList());
		even.addAll(odd);
		
		System.out.println(even);
	}

}
