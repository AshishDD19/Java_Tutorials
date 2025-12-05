package time_complexity;

public class EuclidsAlgoHCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 45;
		int b = 18;
		
		while(a != b) {
			if(a > b) {
				a = a - b;
			}
			else {
				b = b - a;
			}
		}
		System.out.println(a);
	}

}
