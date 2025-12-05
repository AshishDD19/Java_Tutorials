package java_8;

import java.util.function.Function;

//Function functional interface

/*1. one abstract method  apply(T r);

interface Function<R,T>{
	R apply(T t);
}*/
//
//T : type of input
//R :  return type

public class FunctionInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<String, Integer> f1 = (names) -> names.length();
		
		System.out.println(f1.apply("Ashish"));
		System.out.println(f1.apply("Vinay"));
		
		
		Function<String, String> f2 = (names) -> names.toUpperCase();
		
		System.out.println(f2.apply("Ashish"));
		System.out.println(f2.apply("Vinay"));
	}

}
