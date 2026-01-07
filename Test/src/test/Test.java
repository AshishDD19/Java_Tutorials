package test;

public class Test {

	public static boolean checkPrime(int num) {
		if(num <= 1) {
			return false;
		}
		
		if(num == 2) {
			return true;
		}
		
		if(num % 2 == 0) {
			return false;
		}
		
		
		for(int i=3;i*i<=num;i+=2) {
			if(num % i == 0) {
				return false;
			}
		}
		
		return true;
	}
	
	public static int count(int num) {
		int cnt = 0;
		
		while(num != 0) {
			num = num /10;
			cnt++;
		}
		
		return cnt;	
	}
	
	
	public static void minSteps(int start, int end) {
		
		String num  = String.valueOf(start);
		String res = "";
		int num2 = 0;
//		int a = 0;
		for(int i=0;i<=9;i++) {
			for(int j=0;j<num.length()-1;j++) {
				String s = num.substring(j, j+1);
				 int a = Integer.parseInt(s) + i;
				 res = num.substring(j-1,j) + num.substring(j+1);
			}
			
			int b = Integer.parseInt(res);
			if(checkPrime(b) && count(b) == 4) {
				num2 = b;
			}
//			num=b;
			
			
		}

		while(start != end) {
			
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
