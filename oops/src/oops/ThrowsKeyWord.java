package oops;

class Test2 {
	void func1() throws ArithmeticException, ArrayIndexOutOfBoundsException {
		int c = 10/5;
		System.out.println(c);
		int arr [] ={2,3,4,5,1};
		System.out.println(arr[-1]);
	}
}

public class ThrowsKeyWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test2 t =  new Test2();
		
		try {
			t.func1();
		}
		catch(ArithmeticException e) {
			System.out.println("Can't divide by zero");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Can't access the element outside array");
		}
		catch(Exception e) {
			System.out.println("Exception handled");
		}
		System.out.println("Program terminated normally");

	}

}
