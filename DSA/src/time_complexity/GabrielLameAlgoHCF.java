package time_complexity;

public class GabrielLameAlgoHCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 45;
		int b = 18;
		
		while(a != 0 && b != 0) {
			if(a>b) {
				a = a % b;
			}
			else {
				b = b % a;
			}
		}
		if(a != 0) { 
			System.out.println(a);
		}
		else {
			System.out.println(b);
		}
	}

}
