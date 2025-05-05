package datatAndTimeAPI;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ZonedDateTime  indiaTime = ZonedDateTime.now();
		System.out.println(indiaTime);
		
		System.out.println(indiaTime.getZone());
		
//		System.out.println(ZoneId.getAvailableZoneIds());
		
		ZonedDateTime dubaiTime = ZonedDateTime.now(ZoneId.of("Asia/Dubai"));
		System.out.println(dubaiTime);
	}

}
