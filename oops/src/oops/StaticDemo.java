package oops;

class Demo{
	int a,b; //instance variables
	static int x,y; //static variables
	
	//Constructor
	 Demo() {
		// TODO Auto-generated constructor stub
		 System.out.println("Contructor executed");
	}
	 
	//Static block
	static{
		System.out.println("Static block executed");
		
	}
	
	//Non-static block 
	{
		System.out.println("Non-static block executed");
	}
	
	//Static method
	static void method1() {
		System.out.println("Static method executed");
	}
	
	//Non-static method executed
	void method2() {
		System.out.println("Non-static method executed");
	}
}
public class StaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d = new Demo();
		
		Demo.method1();
		d.method1();
		
		d.method2();
		
		d.a = 10;
		d.b = 22;
		Demo.x = 20;
		d.y = 40;
		int n = Demo.x + d.b;
		
		System.out.println(Demo.x);
		System.out.println(Demo.y);
		System.out.println(n);
	}

}
