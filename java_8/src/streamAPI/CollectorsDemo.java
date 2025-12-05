package streamAPI;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = List.of(5,12,15,17);
		List<Integer> n =  numbers.stream().filter(num -> num % 2 ==0).collect(Collectors.toList());
		
		System.out.println(n);
		System.out.println("---------------------------------------");
		
		
		Stream.iterate(10, n1-> n1 +1).limit(6).forEach(System.out::println);
	}

	

}
