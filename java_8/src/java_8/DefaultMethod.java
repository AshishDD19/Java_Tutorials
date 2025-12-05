package java_8;

//interface concrete methods should be default or static

//default method we can override in implementation class


interface DefaultDemo{
	public default void fun1() {
		System.out.println("function 1");
	}

}

class Demo1 implements DefaultDemo{
//	default methods can be overridden , but use without default keyword
	@Override
	public void fun1() {
		// TODO Auto-generated method stub
		System.out.println("Function overridden");
	}

}

public class DefaultMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1 d = new Demo1();
		d.fun1();
		
		DefaultDemo d1 = new Demo1();
		d1.fun1();

	}

}
