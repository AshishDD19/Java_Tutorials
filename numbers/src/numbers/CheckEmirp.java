package numbers;

public class CheckEmirp {
	public static int reverse(int num) {
		int res = 0;
		while(num != 0) {
			res = (res*10) + num%10;
			num /= 10;
		}
		return res;
	}
	public static boolean checkPrime(int num) {
		if(num <=1) {
			return false;
		}
		for(int i=2;i<=Math.sqrt(num);i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean checkEmirp(int num) {
		if(checkPrime(num) && checkPrime(reverse(num))) {
			return true;			
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=100;i++) {
			if(checkEmirp(i)) {
				System.err.println(i);
			}
		}
	}

}
