package numbers;

public class Factorial {
	public static int fact1(int n) {
		int fact = 1;
		for(int i=2;i<=n;i++) {
			fact *= i;
		}
		return fact;
	}
	
	
	//recursive
	public static int fact(int n) {
		if(n <= 1) {
			return 1;
		}
		return n * fact(n-1);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fact(5));
		System.out.println(fact1(5));
	}

}
