package oops;

public class FinallyKeyWordDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5};
		int c;
		
		try {
			c = 10/5;
			System.out.println(c);
			System.out.println(arr[-1]);
			
		}
		
		catch(ArithmeticException e) {
			System.out.println("Can't divide by zero!");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Can't access the element outside array");
		}
		catch(Exception e) {
			System.out.println("Exception handled");
		}
		
		finally {
			System.out.println("Finally block used whether exception occured or not");
		}
	}

}
