package eighth;

import java.util.Calendar;

public class CalendarUsage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar c = Calendar.getInstance();
		int y = c.get(Calendar.YEAR);
		int m = 1 + c.get(Calendar.MONTH);
		int d = c.get(Calendar.DAY_OF_MONTH);
		int w = c.get(Calendar.DAY_OF_WEEK);
		int hh = c.get(Calendar.HOUR_OF_DAY);
		int mm = c.get(Calendar.MINUTE);
		int ss = c.get(Calendar.SECOND);
		int ms = c.get(Calendar.MILLISECOND);
		System.out.println(y + "-" + m + "-" + d + " " + w + " " + hh + ":" + mm +":" + ss + "." + ms);
	}

}
