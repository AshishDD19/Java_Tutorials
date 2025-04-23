package oops;

class Addition{
	void add() {
		int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println(c);
	}
	
	void add(int a) {
		int b = 20;
		int c = a+b;
		System.out.println(c);
	}
	
	void add(int a, int b) {
		int c = a+b;
		System.out.println(c);
	}
	
	void add(float a) {
		float b = 11.11f;
		System.out.println(a+b);
	}
	
	void add(float a, float b){
		System.out.println(a+b);
	}
	
	void add(int a, float b) {
		System.out.println(a+b);
	}
	
	void add(float a, int b) {
		System.out.println(a+b);
	}
	
	void add(int a, float b, double c) {
		System.out.println(a+b+c);
	}
}
public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition a = new Addition();
		int x = 10;
		int y = 20;
		float p = 11.11f;
		float q = 22.22f;
		double n = 111.111;
		
		a.add();
		a.add(x);
		a.add(x, y);
		a.add(p);
		a.add(p, q);
		a.add(y, q);
		a.add(p, x);
		a.add(x, p, n);
	}

}
