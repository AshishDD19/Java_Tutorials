package numbers;

public class PallindromePattern {
	public static int revNum(int num) {
		int res = 0;
		while(num != 0) {
			int rem = num % 10;
			res = (res*10) + rem;
			num = num / 10;
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 6;
		int k=1;
		for(int i=1;i<=rows ;i++) {
			for(int j=1; j<=i ;) {
					
				int res = revNum(k);
				if(k == res) {
					System.out.print(k + " ");
					j++;
					
				}
				k++;			
			}
			System.out.println();
		}

	}

}
