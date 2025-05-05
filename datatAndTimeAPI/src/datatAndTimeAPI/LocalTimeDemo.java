package datatAndTimeAPI;

import java.time.LocalTime;

public class LocalTimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalTime now = LocalTime.now();
		System.out.println(now);
		
		LocalTime custom = LocalTime.of(3, 14);
		System.out.println(custom);
		
		LocalTime noon = LocalTime.NOON;
		System.out.println(noon);
		
		LocalTime parsedTime = LocalTime.parse("14:02");
		System.out.println(parsedTime);
		
		LocalTime before1hour = now.minusHours(1);
		System.out.println(before1hour);
		
		if(now.isAfter(before1hour)) {
			System.out.println("yes!");
		}
		
	}

}
