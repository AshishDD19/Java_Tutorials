package numbers;

import java.util.Scanner;

public class PrintDeseriumNums {
	public static int count(int num) {
		int cnt = 0;
		while(num != 0) {

			num = num / 10;
			cnt++;
		}
		
		return cnt;
	}
	
	public static int deseriumCheck(int num) {
		int res = 0;
		int cnt = count(num);
		while(num != 0) {
			int rem = num % 10;
			res = res + (int)Math.pow(rem,cnt );
			num = num / 10;
			cnt--;
		}
		
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a range until the nos should be printed: ");
		int num = sc.nextInt();
		System.out.println("Deserium no.s until "+num+" are:");
		for(int i=1;i<=num;i++) {
			int res = deseriumCheck(i);
//			System.out.println(res);
			if(i == res) {
				System.out.println(i);
			}
		}

	}

}
