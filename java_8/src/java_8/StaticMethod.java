package java_8;


//Static Method can used in the Interface
//but we cannot override the static methods

interface StaticDemo{
	static void fun1() {
		System.out.println("Interface method");
	}
}

class Demo2 implements StaticDemo{
	static void fun1() {
		System.out.println("Class method");
	}
}
public class StaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticDemo s = new Demo2();
//		s.fun1; 		complie time error, cannot call using interface reference
				
		StaticDemo.fun1();
		
		
		Demo2 d = new Demo2();
		d.fun1();
	}

}
