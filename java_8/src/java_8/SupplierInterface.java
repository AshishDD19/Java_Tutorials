package java_8;

import java.util.function.Supplier;

//Supplier Functional Interface

//1. it consist of 1 abstract method  get();
//2. it will not take any input but only return the value

//T get()



public class SupplierInterface {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier s1 = () -> {
			System.out.println("Supplier without genric");
			return "hi";
		};
		
		System.out.println(s1.get());
		
		
		Supplier<String> s2 = () ->{
			System.out.println("Supplier interface");
			return "java";
		};
		System.out.println(s2.get());
		
		
		Supplier<String> s = () -> {
			String otp = "";
			
			for(int i=1;i<=4;i++) {
				otp = otp + (int)(Math.random()*5);
			}
			return otp;
		};
		
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		
	}

}
