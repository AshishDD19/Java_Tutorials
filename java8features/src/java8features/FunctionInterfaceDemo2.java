package java8features;

import java.util.function.Function;

public class FunctionInterfaceDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		default methods
		Function<String, String> fun1 = s -> s.toUpperCase();
		Function<String, String> fun2 = s -> s.substring(0, 3);
		
		//andThen()
		System.out.println(fun1.andThen(fun2).apply("Bobby"));
		
		Function<Integer, Integer> fun3 = x -> x * 2;
		Function<Integer, Integer> fun4 = x -> x * x * x;
		
		System.out.println(fun3.andThen(fun4).apply(3));
		System.out.println(fun4.andThen(fun3).apply(3));
		
		//compose()
		System.out.println(fun3.compose(fun4).apply(3));
		
		
//		static method
		//identity()
		
		System.out.println(Function.identity().apply("Bob"));

	}

}
