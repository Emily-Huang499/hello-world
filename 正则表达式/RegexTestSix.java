package tenthc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTestSix {

	public static void main(String[] args) {
		//替换字符串
		String s1 = "The     quick brown\t fox jumps\t over the lazy dog.";
		String r1 = s1.replaceAll("\\s+", " ");
		System.out.println(r1);
		
		//反向引用
		String s2 = "The quick brown fox jumps over the lazy dog.";
		String r2 = s2.replaceAll("\\s([a-z]{4})\\s"," <b>$1</b> ");
		System.out.println(r2);
		
		 //分割字符串
//		String s3 = "a b c";
//		String[] r3 = s3.split("\\s");
//		System.out.println(r3);
		
		//搜索字符串
		String s4 = "The quick brown fox jumps over the lazy dog.";
		Pattern p = Pattern.compile("\\wo\\w");
		Matcher m = p.matcher(s4);
		while (m.find()) {
			String sub = s4.substring(m.start(), m.end());
			System.out.println(sub);
			}
		}
}
