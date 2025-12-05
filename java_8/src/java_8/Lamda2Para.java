package java_8;


interface Lamda2{
	double fun1(double a);
}
public class Lamda2Para implements Lamda2{
	@Override
	public double fun1(double a) {
		// TODO Auto-generated method stub
		System.out.println("Without lambda:");
		return a + 100;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lamda2 l = new Lamda2Para();
		System.out.println(l.fun1(200.0));
		
		Lamda2 l1 = (a) -> a + 300;
		
		Lamda2 l2 = (b) ->{
			return b + 500;
		};
		
		System.out.println("With Lambda");
		System.out.println(l1.fun1(200));
		System.out.println(l2.fun1(300));
	}



}
