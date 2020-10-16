import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTestReview02 {

	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("(\\d{3,4})\\-(\\d{7,8})");
		System.out.println(pattern.matcher("010-12345678").matches());
		System.out.println(pattern.matcher("021-123456").matches());
		System.out.println(pattern.matcher("010#12345678").matches());
		
		Matcher matcher = pattern.matcher("010-12345678");
		if (matcher.matches()) {
			String whole = matcher.group(0);
			String are = matcher.group(1);
			String tel = matcher.group(2);
			System.out.println(whole);
			System.out.println(are);
			System.out.println(tel);
		}
	}
}
