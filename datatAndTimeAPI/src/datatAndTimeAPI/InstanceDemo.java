package datatAndTimeAPI;

import java.time.Duration;
import java.time.Instant;

public class InstanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long currentTimeMilli = System.currentTimeMillis();
		System.out.println(currentTimeMilli);
		
		Instant now = Instant.now();
		System.out.println(now);
		
		Instant epoch = Instant.EPOCH;
		System.out.println(epoch);
		
		Duration d = Duration.between(now, epoch);
		System.out.println(d);
	
	}

}
