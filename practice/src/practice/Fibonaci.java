package practice;

public class Fibonaci {

	static void fib(int num) {
		int first = 0;
		int second = 1;
		
		
		
		for(int i=1;i<=num;i++) {
			System.out.println(first);
			int sum = first + second;
			
			first = second;
			second = sum;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 7;
		fib(num);
	}

}
