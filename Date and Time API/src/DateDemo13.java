import java.io.*;

import java.time.*;
import java.util.Date;

public class DateDemo13 {

	public static void main(String[] args) {
		
		
		
		LocalTime t = LocalTime.now();
		System.out.println(t);
		//t.minusHours(3);
		
		LocalTime t1 = t.minusHours(3);
		System.out.println(t);

	}

}

