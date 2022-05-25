
import java.io.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class DateDemo9 {

	public static void main(String[] args) {
		
		GregorianCalendar gc = new GregorianCalendar();
	
		gc.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
		TimeZone tz = gc.getTimeZone();
		
	
		System.out.println(tz.getID());
	}

}