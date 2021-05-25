//Date and Time feature was available in older versions of java, but has now been improvised since Java 8
//All Date and time Classes were available in java.util package in Java 7 or earlier. 
//now is a static function that gets the Machine's current date and time.
//U also have java.sql.Date that could be used in conjunction with SQL Languages. Helpful if U R creating JDBC programs(Database Apps)...
//Older java apps used another API under java.util.Calendar to perform all kinds date Time operations. Explore on Tutorial point on how this calendar was used to get the date, time, parsing information. 

import java.util.*;
import java.time.*;//Available since J-8 which is more powerful and easy to work with.
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.text.SimpleDateFormat;//This is used to parse the date as per the required format....

public class DateTimeExample {
	public static void main(String[] args) {
		/*
		 * Use this only for backward compatibility.
		 * Date dt = new Date(); System.out.println(dt);
		*/
		//basicDateTimeFunc();
		//displayAge();
		//displayTimeDiff();
		//displayDateUsingNumbers();
		//dateTimeFormatterDemo();
		//displayDateOnCulture();
		//displayingUsingSimpleDateFormat();
	}
	
	//for backward compatibility...
	private static void displayingUsingSimpleDateFormat() {
		//Java provides a class called SimpleDateFormat that allows U to format and parse dates as per UR system requirements. 
		Date dt = new Date();
		String format = "dd/MM/yyyy";
		SimpleDateFormat fm = new SimpleDateFormat(format);
		System.out.println(fm.format(dt));
	}

	private static void displayDateOnCulture() {
		LocalDateTime dt = LocalDateTime.now();
		String format = dt.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).withLocale(Locale.CHINA));
		System.out.println(format);
	}

	private static void dateTimeFormatterDemo() {
		LocalDateTime dt = LocalDateTime.now();
		String date = dt.format(DateTimeFormatter.ofPattern("dd-MMM-yyyy"));
		System.out.println(date);
	}

	private static void displayDateUsingNumbers() {
		int yr = MyConsole.getNumber("Enter the Year of Birth");
		int month = MyConsole.getNumber("Enter the Month no");
		int day = MyConsole.getNumber("Enter the day of the month");
		
		LocalDate dt = LocalDate.of(yr, month, day);
		System.out.println("The selected date is " + dt);
		
	}

	private static void displayTimeDiff() {
		LocalTime startTime = LocalTime.of(11, 30);
		LocalTime currTime = LocalTime.now();
		long totalMin = Duration.between(startTime, currTime).getSeconds() / 60;
		System.out.println("The total duration till now is " + totalMin);
		
	}

	private static void displayAge() {
		LocalDate dob = MyConsole.getDate("Enter UR Date of Birth as YYYY-MM-DD");
		LocalDate cur = LocalDate.now();
		//Period is related to Date differences...
		int age = Period.between(dob, cur).getYears();
		System.out.println("The age is " + age);
	}

	private static void basicDateTimeFunc() {
		////////////////////////////////Example to get the System date///////////////////////
		LocalDate dt = LocalDate.now();//Gives the date object
		System.out.println(dt);//Displays the current date with the format specified by the OS
		////////////////Example to get the System Time////////////////////////////////
		LocalTime tm = LocalTime.now();//Gives the time object.
		System.out.println(tm);//Displays the current time in the format of (hr, min, sec, nanosec)
		///////////////////////Add Date and getting the value///////////////////////////////
		LocalDate tomorrow = LocalDate.now().plusDays(1);//Tomorrow's date. 
		//////////////////////Taking input from the User and get the Date/////////////////
		//String date = MyConsole.getString("Enter the date as YYYY-MM-DD");
		//LocalDate today = LocalDate.parse(date);
		
		//use the helper function to get the data as input from the user. The format of the date is important while U ask the user to enter a valid date. However U could use culture info to set the culture of the system and then take inputs  
		LocalDate today = MyConsole.getDate("Enter the date as YYYY-MM-DD");
		System.out.println("The month selected is " + today.getMonth());
		System.out.println("The Year selected is " + today.getYear());
		System.out.println("The Day selected is " + today.getDayOfMonth());
	}
}
