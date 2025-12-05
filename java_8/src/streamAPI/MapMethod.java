package streamAPI;

import java.util.Arrays;
import java.util.List;

public class MapMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = Arrays.asList("Ashish","Kiran","Bob","Arya");
		
		names.stream().map(str -> str.toUpperCase()).forEach(System.out::println);
		
		System.out.println("----------------");
		names.stream().mapToInt(str -> str.length()).forEach(System.out::println);
		
		System.out.println("----------------");
		names.stream()
		.filter(str -> str.startsWith("A"))
		.map(str -> str.toUpperCase() )
		.forEach(System.out::println);
	}

}
