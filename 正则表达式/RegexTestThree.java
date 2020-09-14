package tenthc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTestThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern pattern = Pattern.compile("(\\d{2})\\:(\\d{2})\\:(\\d{2})");
		Matcher matcher = pattern.matcher("23:01:59");
		if (matcher.matches()) {
			String hour = matcher.group(1);
			String minute = matcher.group(2);
			String second = matcher.group(3);
			System.out.println(hour);
			System.out.println(minute);
			System.out.println(second);
		}
	}

}
