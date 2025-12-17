package problems;

public class TripleDoubleRepeatingDigitsCheck {

	public static int checkNum(long num1, long num2) {
		String s1 = String.valueOf(num1);
		String s2 = String.valueOf(num2);
		
		for(int i=0;i<=9;i++) {
			String triple = ""+i+i+i;
			String twice = ""+i+i;
			
			if(s1.contains(triple) && s2.contains(twice)) {
				return 1;
			}
		}
		return 0;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checkNum(4566623, 32466));
		System.out.println(checkNum(456623, 32466));
	}

}
