package java_8;

interface MethodPract{
	void func1();
}


class Method1{
	public void func2() {
		System.out.println("Normal method");
	}
}

class Method2{
	public static void func3() {
		System.out.println("Static method");
	}
}


public class MethodReferencePract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		calling non-static method
		Method1 m = new Method1();
		
		MethodPract mp = m :: func2;
		mp.func1();

		
		
//		calling static method
		MethodPract mp1 = Method2 :: func3;
		mp1.func1();
		
//		using anonymous object
		
		MethodPract mp2 = new Method1()::func2;
		mp2.func1();
	}

}
