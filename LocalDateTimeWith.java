package eighth;

import java.time.*;
import java.time.temporal.*;

public class LocalDateTimeWith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime firstDay = LocalDate.now().withDayOfMonth(1).atStartOfDay();
		System.out.println(firstDay);
		LocalDate lastDay = LocalDate.now().with(TemporalAdjusters.lastDayOfMonth());
		System.out.println(lastDay);
		LocalDate nextMonthFirstDay = LocalDate.now().with(TemporalAdjusters.firstDayOfNextMonth());
		System.out.println(nextMonthFirstDay);
		LocalDate firstWeekday = LocalDate.now().with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
		System.out.println(firstWeekday);
	}
}
