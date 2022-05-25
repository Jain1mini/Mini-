import java.io.*;

import java.time.*;
import java.util.Date;

public class DateDemo12 {

	public static void main(String[] args) {
		
		//LocalDate d = LocalDate.now(ZoneId.of("Asia/Kolkata"));
		
		LocalDate d = LocalDate.parse("2022-05-19");
		//d.plusMonths(6);
		LocalDate d1 = d.plusMonths(4);
		System.out.println(d1);

	}

}
