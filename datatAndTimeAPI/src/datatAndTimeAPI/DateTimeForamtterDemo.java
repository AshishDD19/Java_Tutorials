package datatAndTimeAPI;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeForamtterDemo {
	public static void main(String[] args) {
		
		LocalDate now = LocalDate.now();
		DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd/MM/yy");
		
		String format = now.format(myFormat);
		System.out.println(format);
		
		
		
		String date = "25/05/1998";
		DateTimeFormatter myFormat2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate parse = LocalDate.parse(date, myFormat2);
		System.out.println(parse);
		
		
		String dateTimeString = "2023-04-24 10:30:45+05:30";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ssXXX");
		ZonedDateTime zonedDateTime = ZonedDateTime.parse(dateTimeString, formatter) ;
		System.out.println(zonedDateTime) ;
	}
}
