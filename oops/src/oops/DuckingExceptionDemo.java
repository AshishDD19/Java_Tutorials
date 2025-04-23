package oops;

class Test{
	void func1() {
		func2();
	}
	
	void func2() {
		int c = 10/0;
	}
}

public class DuckingExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
		try {
			t.func1();
		}
		
		catch(ArithmeticException e) {
			System.out.println("Can't divide by zero");
		}
		
	}

}
