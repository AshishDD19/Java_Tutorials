package java_8;

import java.util.function.BiFunction;

//BiFunction functional interface

/*interface BiFunction<T,U,R>

T: type of 1st argument
U: type of 2nd argument
R: return type

R apply(T t, U u);

it take 2 input and returns a result*/


public class BiFunctionInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiFunction<Integer, Integer, Integer> multi = (n1,n2) -> n1*n2;
		
		int res = multi.apply(25, 32);
		System.out.println(res);
	}

}
