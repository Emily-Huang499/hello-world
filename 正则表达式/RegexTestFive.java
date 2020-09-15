package tenthc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTestFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern pattern = Pattern.compile("(\\d+?)(0*)");
		Matcher matcher = pattern.matcher("12345000");
		if (matcher.matches()) {
			System.out.println("group1=" + matcher.group(1));
			System.out.println("group2=" + matcher.group(2));		
		}
	}
}
