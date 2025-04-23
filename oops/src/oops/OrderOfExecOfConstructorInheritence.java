package oops;

class A{
	A() {
		System.out.println("A's constructor");
	}
}

class B extends A{
	B(){
		System.out.println("B's constructor");
	}
}

class C extends B{
	
	C(){
		System.out.println("C's constructor" );
	}
	
}


public class OrderOfExecOfConstructorInheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		A a = new A();
		B b = new B();
		C c = new C();

	}

}
