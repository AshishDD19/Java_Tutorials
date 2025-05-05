package datatAndTimeAPI;

import java.time.LocalDate;
import java.time.Period;

public class PeriodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate now = LocalDate.now();
		LocalDate then = LocalDate.of(1947, 7, 15);
		
		Period p = Period.between(now, then);
		System.out.println(p);
	}

}
