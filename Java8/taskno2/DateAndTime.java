package taskno2;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

//collections are user for storing data and stream is used for processing the data
public class DateAndTime {
	public static void main(String[] ags) throws Exception{
		LocalTime time=LocalTime.now();
		System.out.println("Now Time is:"+time);
		LocalTime berforeHour=time.minusHours(1);
		System.out.println("Bofore one hour time is:"+berforeHour);
		LocalDate present=LocalDate.now();
		System.out.println("today date is:"+present);
		LocalDate beforeDate=present.minusDays(1);
		System.out.println("Yesterday date is "+beforeDate);
		LocalDate afterDate=present.plusDays(1);
		System.out.println("tommorow date is "+afterDate);
		LocalDateTime justNow=LocalDateTime.now();
		System.out.println("today time is "+justNow);
		
		
		

		
	}

}
