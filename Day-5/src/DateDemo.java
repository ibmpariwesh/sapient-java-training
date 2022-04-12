import java.util.Calendar;
import java.util.Date;

public class DateDemo {
	public static void main(String[] args) {
		Calendar calendar = new Calendar.Builder().build();
		System.out.println(calendar.getCalendarType());
		
		Date dob = new Date();
		System.out.println(dob);
	}
}
