import java.io.*;

import java.time.*;
import java.util.Date;

public class DateDemo14 {

	public static void main(String[] args) {
		
		
		
		LocalTime t = LocalTime.now();
		System.out.println(t);
		LocalTime t1 = t.minusHours(3);
		System.out.println(t1);

		
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
	}



}
