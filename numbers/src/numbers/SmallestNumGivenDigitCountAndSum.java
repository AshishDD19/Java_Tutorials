package numbers;

public class SmallestNumGivenDigitCountAndSum {

	public static int smallDigit(int s, int k) {
		int start = (int) Math.pow(10, k-1);
		int end = (int) Math.pow(10, k)-1;
		int min = end;
		for(int i=start;i<=end;i++) {
			int sum = 0;
			int num = i;
			while(num != 0) {
				sum += num%10;
				num/=10;
			}
			if(sum == s) {
				min =  i;
				break;
			}
		}
		return min;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(smallDigit(9, 2));

	}

}
