package oops;

class Test1{
	void func1() {
		try {
			func2();
		}
		catch(Exception e) {
			//Re-throwing
			System.out.println("Exception Handled");
			throw e;
		}
		
	}
	
	void func2() {
		
		try {
			int c = 10/0;
		}
		catch(ArithmeticException e) {
			System.out.println("Can't divide by zero");
			//Re-throwing
			throw e;
		}
	}
}

public class ReThrowingExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t = new Test1();
		try {
			t.func1();
		}
		catch(Exception e) {
			System.out.println("Exception Handled");
		}
		
	}

}
