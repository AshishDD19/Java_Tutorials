package java_8;

import java.util.function.Consumer;

//Consumer Functional interface

/*1.consists of one method accept();
2. it will accept input but never returns*/


public class ConsumerInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<String> c = (e) -> System.out.println("Hi "+e+", Welcome to Pentagon");
		
		c.accept("Ashish");
		c.accept("Bob");
		c.accept("Mary");

	}

}
