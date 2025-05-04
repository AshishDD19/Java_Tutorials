package java8features;

interface New{
	static void sayHello() {
		System.out.println("Hello !");
	}
}



public class StaticMethodDemo implements New{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticMethodDemo obj = new StaticMethodDemo();
		
//		cannot call the method using class object reference
//		obj.sayHello();
		
		New.sayHello();
	}

}
