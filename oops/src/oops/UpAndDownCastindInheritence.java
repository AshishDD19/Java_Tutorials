package oops;

class Parent{
	void disp1() {
		System.out.println("Parent disp1");
	}
	
	void disp2() {
		System.out.println("Parent disp2");
	}
}

class Child extends Parent{
	//method overriding
	void disp2() {
		System.out.println("Child disp2");
	}
	
	void disp3() {
		System.out.println("Child disp3");
	}
}


public class UpAndDownCastindInheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();
		c.disp1();
		c.disp2();
		c.disp3();
		
		Parent ref = (Parent)c;//Up Casting -  type casting will be done to 'c' by compiler
		ref.disp1();
		ref.disp2();
		//ref.disp3(); we will get error
		
		((Child)(ref)).disp3();// Down casting

	}

}
