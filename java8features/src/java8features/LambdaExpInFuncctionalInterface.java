package java8features;

interface Employee{
	String getName();
}

public class LambdaExpInFuncctionalInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee se = () -> "Software Engineer"; 
		System.out.println(se.getName()); 
		
		Employee jd = () -> "Java Developer";
		System.out.println(jd.getName());
	}

}
