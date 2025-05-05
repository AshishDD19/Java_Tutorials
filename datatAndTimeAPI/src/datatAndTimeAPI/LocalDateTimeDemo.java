package datatAndTimeAPI;

import java.time.LocalDateTime;

public class LocalDateTimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		LocalDateTime myDate = LocalDateTime.parse("2023-01-11T13:48");
		System.out.println(myDate);		
	}

}
