package java_8;

@FunctionalInterface
interface FuncInterface{
	void fun1(String name);
	
//	void fun2(int a);  error
	
//	while using lambda expresion the interface must be functional interface (only one abstract method)
}
public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FuncInterface f = (name) -> System.out.println(name);
		
		f.fun1("Welcome");
	}

}
