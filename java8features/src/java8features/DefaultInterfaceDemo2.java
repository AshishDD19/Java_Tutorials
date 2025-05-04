package java8features;

interface A{
	default void sayHello() {
		System.out.println("A says hello");
	}
}

interface B{
	default void sayHello() {
		System.out.println("B says hello");
	}
}

public class DefaultInterfaceDemo2 implements A,B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DefaultInterfaceDemo2 n = new DefaultInterfaceDemo2();
		n.sayHello();
		
		
	}

	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		A.super.sayHello();
		B.super.sayHello();
	}

}
