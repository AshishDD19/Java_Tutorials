package datatAndTimeAPI;

import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class DurationDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Instant start = Instant.now();
		
		Thread.sleep(1200);
		int sum = 0;
		for(int i=1;i<=1000000;i++) {
			sum += i+1;
		}
		
		Instant end = Instant.now();
		
		Duration d = Duration.between(start, end);
		System.out.println(d);
		
		Duration d2 = Duration.of(2, ChronoUnit.MILLIS);
		System.out.println(d2);
		
		int n = d.compareTo(d2);
		System.out.println(n);
	}

}
