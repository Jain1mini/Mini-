import java.io.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateDemo7 {

	public static void main(String[] args) {
		
		GregorianCalendar gc = new GregorianCalendar();
		//System.out.println(gc.get(Calendar.DATE));
		
		
		//System.out.println(gc.get(Calendar.MONTH));
		
		System.out.println(gc.get(Calendar.DAY_OF_YEAR));
	}

}



