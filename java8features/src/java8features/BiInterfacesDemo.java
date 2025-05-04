package java8features;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;

public class BiInterfacesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//BiPredicate
		BiPredicate<Integer, Integer> pred = (x,y) -> x % 2 == 0 && y % 2 == 0;
		System.out.println(pred.test(4, 6));
		
		BiPredicate<String, Integer> pred2 = (str,x) -> str.length() == x;
		System.out.println(pred2.test("bob", 3));
		
		//BiFunction
		Function<String, Integer> fun = str -> str.length();
		BiFunction<String, String, Integer> fun1 = (str1,str2) -> str1.length() + str2.length();
		System.out.println(fun1.apply("bob", "Cacey"));
		
		//BiConsumer
		Consumer<Integer> con = x -> System.out.println(x);
		
		BiConsumer<Integer, Integer> con1 = (x,y) -> {
			System.out.println( x + y);
		};
		
		con1.accept(4, 6);
	}

}
