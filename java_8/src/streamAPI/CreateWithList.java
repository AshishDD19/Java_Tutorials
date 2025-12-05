package streamAPI;

import java.util.ArrayList;
import java.util.stream.Stream;

public class CreateWithList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<>();
		al.add("Ashish");
		al.add("Bob");
		al.add("May");
		al.add("Vinay");
		
		Stream<String> s = al.stream();
		s.forEach(System.out::println);

	}

}
