package java8features;

@FunctionalInterface
interface MyInterface{
	void myAbstractMethod();
	
	default void myDefaultMethod() {
		
	}
	
	static void myStaticMethod() {
		
	}
}

@FunctionalInterface
interface ChildInterface extends MyInterface{
	
}


public class FunctionalInterfaceDemo {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
