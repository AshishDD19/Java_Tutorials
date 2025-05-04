package java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> salaryCheck = x -> x > 1000;
		
		System.out.println(salaryCheck.test(2000));
		
		Predicate<String> startsWithLetterV = x -> x.toLowerCase().charAt(0) == 'v';
		System.out.println(startsWithLetterV.test("Virat"));
		
		Predicate<Integer> checkEven = x -> x % 2 == 0;
		List<Integer> list = new ArrayList<>();
		list.add(124);
		list.add(19);
		list.add(44);
		list.add(12);
		list.add(23);
		
		System.out.println("Even no.s :");
		for(int i : list) {
			if(checkEven.test(i)) {
				System.out.println(i);
			}
		}
		
//		default methods
		//negate()
		System.out.println(startsWithLetterV.negate().test("Virat"));
		
		//and
		Predicate<String> endsWithLetterT = x -> x.toLowerCase().charAt(x.length() - 1) == 't';
		
		System.out.println(startsWithLetterV.and(endsWithLetterT).test("Viraj"));
		
		//or
		System.out.println(startsWithLetterV.or(endsWithLetterT).test("Viraj"));
		
//		static methods
		//isEqual()
		
		Predicate<String> checkEqual = Predicate.isEqual("Virat");
		System.out.println(checkEqual.test("Bob"));
	}

}
