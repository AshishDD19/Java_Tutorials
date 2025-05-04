package java8features;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryAndBinaryOperatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//UnaryOperator
		Function<Integer, Integer> fun = x -> x*x;
		
		UnaryOperator<Integer> fun1 = x -> x * x;
		System.out.println(fun1.apply(6));
		
		
		//BinaryOperator
		BiFunction<String, String, String> bifun = (str1,str2) -> str1 + str2;
		
		BinaryOperator<String> biFun2 = (str1,str2) -> str1 + str2;
		System.out.println(biFun2.apply("Hi ", "Hello"));
	}

}
