package java8features;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceDemo {

	//static method
	public static void print(String s) {
		System.out.println(s);
	}
	
	//not a static method
	public void print2(String s) {
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("Alice","Bob","Cacey");
		list.forEach(x -> System.out.println(x));
		
//		or
		
//		using method reference '::'
		//for static method
		list.forEach(MethodReferenceDemo :: print);
		
		//for not static method
		MethodReferenceDemo demo = new MethodReferenceDemo();
		list.forEach(demo :: print2);
	}

}
