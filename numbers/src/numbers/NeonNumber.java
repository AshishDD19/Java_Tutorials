package numbers;

public class NeonNumber {
	
	public static int checkNeon(int num) {
		int n = num*num;
		int sum = 0;
		while(n != 0) {
			sum += n%10;
			n /= 10;
		}
//		System.out.println(sum);
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =9;
		if(num == checkNeon(num)) {
			System.out.println("Is a Neon");
		}
		else {
			System.out.println("not a neon");
		}


	}

}
