package java_8;

import java.util.ArrayList;
import java.util.List;

public class ForEachMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		list.add("HI");
		list.add("How");
		list.add("are");
		list.add("you?");
		
//		using Lambda expression
		list.forEach( n -> System.out.println(n));
		
		System.out.println("---------------------");
		
//		using method reference.
		list.forEach(System.out::println);
	}

}
