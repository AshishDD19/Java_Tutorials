package datatAndTimeAPI;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		LocalDate custom = LocalDate.of(1947, 7, 15);
		System.out.println(custom);
		
		int day = today.getDayOfMonth();
		Month month = today.getMonth();
		int monthVal = today.getMonthValue();
		int year = today.getYear();
		
		System.out.println(day);
		System.out.println(month);
		System.out.println(monthVal);
		System.out.println(year);
		
		LocalDate yesterday = today.minusDays(1);
		System.out.println(yesterday);
		
		LocalDate past = today.minusMonths(12);
		System.out.println(past);
		
		if(today.isAfter(yesterday)) {
			System.out.println("yes!");
		}


		
	}

}
