package streamAPI;

import java.util.Arrays;
import java.util.List;

public class FilterMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(22,13,4,5,19,10);
		
		list.stream().filter( x -> x>10).sorted().forEach(System.out::println);
	}

}
