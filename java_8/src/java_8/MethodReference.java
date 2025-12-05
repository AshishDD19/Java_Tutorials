package java_8;


//Method reference : one method referring another method. 

//   (::) operator

@FunctionalInterface
interface MethodRefDemo{
	void func1();
}

public class MethodReference {
	
	public static void func2() {
		System.out.println("Method reference");
	}
	
	public static void main(String[] args) {
		MethodRefDemo m = MethodReference::func2;
		
		m.func1();
	}
}
