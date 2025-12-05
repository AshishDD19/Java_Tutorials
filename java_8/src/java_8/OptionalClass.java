package java_8;

import java.util.Optional;

/*
Optional class 
it used to avoid NullPointerException
by this Null checks are not required

*/


public class OptionalClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Optional<String> role = Optional.of("dev");
		
		System.out.println(role);
		System.out.println(role.get());
		
	
		System.out.println("Empty Optional Instance: "+Optional.empty() );
		
		String s1 = "Yes";
		String s2 = null;
	
		System.out.println(Optional.ofNullable(s1));
		System.out.println(Optional.ofNullable(s2));
		
		
		Optional<String> o = Optional.of("Ashish");
		
		if(o.isPresent()) {
			System.out.println("Hi i am "+o.get());
		}
		else {
			System.out.println("name not found");
		}
		
		
		Optional<String> o1 = Optional.of("Ashish");
		o1.ifPresent(s -> System.out.println(s.length()));
		
		String n1 = "Ashish";
//		String n1 = null;
		
		String n2 = Optional.ofNullable(n1).orElse("Bob");
		System.out.println(n2);
	
		
		
		String n3 = "Vinay";
//		String n3 = null;
		String n4 = Optional.ofNullable(n3).orElseThrow(IllegalArgumentException :: new);
		System.out.println(n4);
		

	}

}
