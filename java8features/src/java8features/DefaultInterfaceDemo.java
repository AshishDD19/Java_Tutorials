package java8features;

interface Parent{
	
	default void sayHello() {
		System.out.println("Hello");
	}
	
}

class Child implements Parent{
	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		System.out.println("Child says hello");
	}
}

public class DefaultInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child p = new Child();
		p.sayHello();
	
	}

}
