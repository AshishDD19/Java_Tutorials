package practice;

public class DeseriumCheck {

	public static int count(int num) {
		int cnt = 0;
		while(num != 0) {
			num /= 10;
			cnt++;
		}
		return cnt;
	}
	
	public static int checkDeserium(int num) {
		int sum = 0;
		int cnt = count(num);
		while(num != 0) {
			int rem = num % 10;
			sum += Math.pow(rem,cnt);
			num /= 10;
			cnt--;
		}
		System.out.println(sum);
		return sum;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 135;
		if(num == checkDeserium(num)) {
			System.out.println("Deserium");
		}
		else {
			System.out.println("not");
		}
		
	}

}
