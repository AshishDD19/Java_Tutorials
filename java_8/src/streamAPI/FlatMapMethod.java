package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> languages = Arrays.asList("c#","java","c++","scalar");
		List<String> ftech =  Arrays.asList("html","css","react");
		
		List<List<String>> developper = Arrays.asList(languages,ftech);
		developper.stream().forEach(System.out::println);
		
		System.out.println("=========================================");
		Stream<String> s1  = developper.stream().flatMap(s -> s.stream());
		s1.forEach(System.out::println);
	
	}


	

}
