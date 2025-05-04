package java8features;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<String> sup = () -> "Bob";
		System.out.println(sup.get());

		Predicate<Integer> pred = x -> x % 2 == 0;
		Function<Integer, Integer> fun = x -> x * x; 
		Consumer<Integer> con = x -> System.out.println(x);
		Supplier<Integer> supp = () -> 102;
		
		if(pred.test(supp.get())) {
			con.accept(fun.apply(supp.get()));
		}
		
	}

}
