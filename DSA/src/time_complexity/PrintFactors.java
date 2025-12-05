package time_complexity;

public class PrintFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 24;
		for(int i=1;i<Math.sqrt(n);i++) {
			if(n % i == 0) {
				System.out.println(i);
			}
		}
		
		for(int i=(int) Math.sqrt(n);i>=1 ;i--) {
			if(n % i ==0) {
				System.out.println(n/i);
			}
		}
	}

}
