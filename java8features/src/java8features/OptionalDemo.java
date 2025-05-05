package java8features;

import java.util.Optional;

public class OptionalDemo {

	public Optional<String> getName(int id) {
		String name = null;
		return Optional.ofNullable(name);
	}
	
	public static Optional<String> getName1(int id){
		
//		return Optional.empty();
		return Optional.of("bob");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OptionalDemo obj = new OptionalDemo();
		
		Optional<String> name = obj.getName(2);
		
		if(name.isPresent()) {
			System.out.println(name.get());
		}
		
//		or
		name.ifPresent(x -> System.out.println(x));
		
//		set default values
		Optional<String> name2 = getName1(3);
		String nameToBeUsed = name2.orElse("NA");
		System.out.println(nameToBeUsed);
		
//		using Optional directly
		Optional<String> result = name2.map(x -> x.toUpperCase());
		result.ifPresent(x -> System.out.println(x));
		
	}

}
