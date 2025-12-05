package java_8;

class A{
	static void fun1() {
		System.out.println("class A");
	}
}


class B extends A{
	static void fun1() {
		System.out.println("class B");
	}
}
public class MethodHiding {
	public static void main(String[] args) {
		A a = new B();
		a.fun1();
		
//		Method hiding
//		when we try to run the overridden static methods of child class while upcasting 
//		the method of parent class is invoked
		
		
		B b = new B();
		b.fun1();
		

	}
}
