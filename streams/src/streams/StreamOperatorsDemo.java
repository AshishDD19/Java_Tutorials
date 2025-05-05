package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOperatorsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(88,44,12,2,3,41,45,23,11,32,88,90,102,2,0,32,0);
		
		//filtered() method
		List<Integer> filteredList = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
		System.out.println(filteredList);
		
		//map() method
		List<Integer> divideBy2 = filteredList.stream().map(x -> x / 2).collect(Collectors.toList());
		System.out.println(divideBy2);
		
		//distinct()  method
		List<Integer> removeDuplicate = divideBy2.stream().distinct().collect(Collectors.toList());
		System.out.println(removeDuplicate);
		
		//sorted()  method

		List<Integer> sort = removeDuplicate.stream().sorted().collect(Collectors.toList());
		System.out.println("Ascending sort: "+sort);
		List<Integer> sortDesc = removeDuplicate.stream().sorted( (a,b) -> b - a).collect(Collectors.toList());
		System.out.println("Descending sort: "+sortDesc);
		
		
		
		List<Integer> newList = Stream.iterate(0, x -> x + 1)
								.limit(51)
								.skip(1)
								.filter(x -> x % 2 == 0)
								.map(x -> x / 2)
								.distinct()
								.sorted()
								.peek(x -> System.out.println(x))
								.collect(Collectors.toList());
				
		
		//terminal operations - max , min , count
		int l2 = Stream.iterate(0, x -> x + 1).limit(51)
							.max((a,b) -> a - b).get();
		
		System.out.println("max value: "+l2);
		
		int l3 = Stream.iterate(0, x -> x + 1).limit(51)
				.min((a,b) -> a - b).get();

		System.out.println("min value: "+l3);
		
		long l4 = Stream.iterate(0, x -> x + 1).limit(51)
				.count();
		System.out.println("count: "+l4);
		
		//parallelStream() method
		
		Stream<Integer> parallel = list.parallelStream();
		long count = parallel.count();
		System.out.println(count);
	}

}
