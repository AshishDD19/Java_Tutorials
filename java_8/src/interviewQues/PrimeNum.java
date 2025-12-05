package interviewQues;

import java.util.stream.Stream;

public class PrimeNum {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<Integer> num = Stream.of(1,2,3,4,5,6,7,8,9,10);
		num.filter((x) -> {
			if(x <= 1) {
				return false;
			}
			for(int i=2;i<=Math.sqrt(x);i++) {
				if(x % i == 0) {
					return false;
				}
			}
			return true;
		}).forEach(System.out::println);
	}

}
