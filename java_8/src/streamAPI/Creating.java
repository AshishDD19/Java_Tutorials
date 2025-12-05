package streamAPI;

import java.util.stream.Stream;

public class Creating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<Integer> st = Stream.of(9,3,4,12,34,45);
//		st.forEach(System.out::println);
		
		System.out.println("-----Sorted--------");
		st.sorted().forEach(System.out::println);

	}

}
