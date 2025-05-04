package java8features;

interface New2{
	public static void sayHello() {
		System.out.println("Hello in interface");
	}
}


public class StaticMethodDemo2 implements New2 {
	public static void sayHello() {
		System.out.println("Hello in class");
	}
	


}
