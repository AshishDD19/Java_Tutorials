package oops;

class A1{
	void add() {
		System.out.println("Added");
	}
}

interface B1{
	void sub();
}

class C1 extends A1 implements B1{
	public void sub() {
		System.out.println("Subtracted");
	}
}

public class MultipleInheritenceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C1 c = new C1();
		c.add();
		c.sub();
	}

}
