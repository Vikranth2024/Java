package pkg;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimeZone {
	public static void main(String[] args) {
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		LocalDateTime ldt1 = LocalDateTime.now();
		String ldt2 = dtf1.format(ldt1);
		System.out.println(ldt2);
		
		Instant t1 = Instant.now();
		String t2 = dtf1.format(t1);
		System.out.println(dtf1.format(t1));
		
		
		
	
		

	}

}
