package examples;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;

import org.testng.annotations.Test;

public class Timestamp {
	@Test
	public void main() throws InterruptedException{
		SimpleDateFormat Myformat = new SimpleDateFormat("yyyy/MMM/dd HH:mm:ss");
		Calendar calendar = Calendar.getInstance();			// get a calendar instance, which defaults to "now"
		Date today = calendar.getTime();					// get a date
		/*    Another way to get a date without get a calendar
	    Date today1 = new Date();*/

		System.out.println("Timestamp is: " + calendar.getTimeInMillis());	// or System.out.println("Timestamp is: " + System.currentTimeMillis());
		System.out.println("GetTime is: " + calendar.getTime());
		System.out.println("\ntoday:    " + Myformat.format(today));		// Format a Date instance to String (Case 1)

		calendar.add(Calendar.DAY_OF_WEEK, 7);				// Add more 7 days
		Date future = calendar.getTime();
		System.out.println("future day: " + Myformat.format(future) + "\n");

		String userNamePrefix = "FFThinh-";
		String[] usernames = new String[10];
		for(int i = 0; i < usernames.length; i++) {
			//	        long timestamp = System.currentTimeMillis();
			usernames[i] = userNamePrefix + System.currentTimeMillis();
			System.out.println("No " + i + ": " + usernames[i]);
			Thread.sleep(1);
		}

		calendar = Calendar.getInstance();
		calendar.add(Calendar.MONTH, 14);					// Add more 14 months
		String day_format = new SimpleDateFormat("dd").format(calendar.getTime());	// Format a Date instance to String (Case 2)
		@SuppressWarnings("resource")
		String mon_format = new Formatter().format("%tb", calendar).toString();		// Format a Date instance to String (Case 3)
		String year_format = new SimpleDateFormat("yyyy").format(calendar.getTime()).toString();
		System.out.println("\n The day after increasing is: ");
		System.out.println(day_format);
		System.out.println(mon_format);
		System.out.println(year_format);
		System.out.println("\n");

		/*Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
	      Date datea = calendar.getTime();			//getTime() returns the current date in default time zone
	      int day = calendar.get(Calendar.DATE); 
	      int month = calendar.get(Calendar.MONTH) +1; 	//Note: +1 the month for current month
	      int year = calendar.get(Calendar.YEAR);
	      int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
	      int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
	      int dayOfYear = calendar.get(Calendar.DAY_OF_YEAR);

	      System.out.println("Current Date is: " + datea);
	      System.out.println("Current Day is:: " + day);
	      System.out.println("Current Month is:: " + month);
	      System.out.println("Current Year is: " + year);
	      System.out.println("Current Day of Week is: " + dayOfWeek);
	      System.out.println("Current Day of Month is: " + dayOfMonth);
	      System.out.println("Current Day of Year is: " + dayOfYear);

	      //Get the Month's Name
	      Formatter mon_format = new Formatter();	  mon_format.format("%tb", calendar);
	      //		String mon_format = new Formatter().format("%tb", cal).toString();
	      System.out.println(mon_format);
		  //or
		  String a = calendar.getDisplayName(Calendar.MONTH, Calendar.SHORT, Locale.getDefault());
		  System.out.println(a);
		  //or
		  String b = new SimpleDateFormat("MMM").format(cal.getTime()).toString();
		  System.out.println(b);
		 */
	}		
}