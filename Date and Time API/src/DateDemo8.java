
import java.io.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class DateDemo8 {

	public static void main(String[] args) {
		
		GregorianCalendar gc = new GregorianCalendar();
	
		TimeZone tz = gc.getTimeZone();
		//System.out.println(tz.getDisplayName());
	
		System.out.println(tz.getID());
	}

}