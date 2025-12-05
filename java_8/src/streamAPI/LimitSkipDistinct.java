package streamAPI;

import java.util.Arrays;
import java.util.List;

public class LimitSkipDistinct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> progLang = Arrays.asList("Java","C#","C++","Python");
		progLang.stream().limit(2).forEach(System.out::println);
		
		System.out.println("---------------------");
		progLang.stream().skip(2).forEach(System.out::println);
		
		System.out.println("---------------------");
		
		
		List<String> names = Arrays.asList("Ashish","Bob","Bob","Vinay");
		names.stream().distinct().forEach(System.out::println);
		
	}

}
