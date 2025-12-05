package java_8;

import java.util.function.Predicate;

public class PredicateInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> p = (i) -> i > 10;
		
		System.out.println(p.test(5));
		System.out.println(p.test(15));
	}

}
