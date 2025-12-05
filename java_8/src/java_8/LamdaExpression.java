package java_8;

interface LamdaDemo{
	void fun1();

}



public class LamdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LamdaDemo l = () -> System.out.println("Lambda Expression");
		l.fun1();
		
		

	}

}
