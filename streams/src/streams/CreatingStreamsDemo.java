package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CreatingStreamsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("apple","banana","cherry");
		Stream<String> stream = list.stream();
		
		String[] arr = {"apple","banana","cherry"};
		Stream<String> stream2 = Arrays.stream(arr);
		
		Stream<Integer> intStream = Stream.of(1,2,3,4);
		
		Stream<Integer> limit = Stream.iterate(0, x -> x + 1).limit(50);
		List<Integer> result = limit.collect(Collectors.toList());
		System.out.println(result);
		
		Stream<String> limit2 = Stream.generate(() -> "hello").limit(10);
		
		Stream<Integer> limit3 = Stream.generate(() -> (int)Math.random() * 100).limit(20);

	}
	

}
