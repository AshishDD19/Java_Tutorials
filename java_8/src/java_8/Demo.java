package java_8;

interface IPractice{
//	 public static final int a = 10;
	int a = 10;
	
//	public abstract void fun1();
	void fun1();
}


class Practice implements IPractice{

	@Override
	public void fun1() {
		// TODO Auto-generated method stub
		System.out.println("Number:" + a);
		
	}
	
	void add() {
		System.out.println("Added");
	}
	
}

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		IPractice i  = new IPractice();   Compile time error
		
		IPractice p1 = new Practice(); //upCasting
		p1.fun1();
//		p1.add();		Compile time error
		
		Practice pr = new Practice();
		pr.add();
		pr.fun1();
		
		((Practice)(p1)).add(); //downCasting
		
		

	}

}
