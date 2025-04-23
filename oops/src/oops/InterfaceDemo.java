package oops;


interface Maths{
	void add();
	void sub();
}

interface AdvMaths extends Maths{
	void div();
	void mult();
}

abstract class Compute1 implements AdvMaths{
	public void add() {
		System.out.println("Added");
	}
	
	public void sub() {
		System.out.println("Subtracted");
	}
	
	public void mult() {
		System.out.println("Multiplied");
	}
}

class Compute2 extends Compute1{
	public void div() {
		System.out.println("Divided");
	}
}


public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Cannot create object of interfaces and abstract classes
//		Maths m = new Maths();
//		AdvMaths a = new AdvMaths();
//		Compute1 c1 = new Compute1();
		
		Compute2 c2  = new Compute2();
		c2.add();
		c2.sub();
		c2.mult();
		c2.div();
	}

}
