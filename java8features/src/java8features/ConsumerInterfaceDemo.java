package java8features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Consumer<String> con = s -> System.out.println(s);
		con.accept("Bob");
		
		Consumer<List<Integer>> list1 = x -> {
			for(Integer i : x) {
				System.out.println(i+100);
			}
		};
		
		list1.accept(Arrays.asList(1,2,3,4,5));
		
		
		//Default method
		//andThen()
		
		Consumer<List<Integer>> list2 = x -> {
			for(Integer i : x) {
				System.out.println(i);
			}
		};
		
		list2.andThen(list1).accept(Arrays.asList(1,2,3,4,5));
	}

}
