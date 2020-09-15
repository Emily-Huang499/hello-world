package tenthc;

public class RegexTestFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//匹配非ASCII字符
		String re1 = "a\\u548cb";
		System.out.println("匹配非ASCII字符：");
		System.out.println("a和b".matches(re1));
		System.out.println("a&b".matches(re1));
		//匹配任意字符
		String re2 = "a.c";
		System.out.println("匹配任意字符：");
		System.out.println("abc".matches(re2));
		System.out.println("adc".matches(re2));
		System.out.println("ac".matches(re2));
		System.out.println("ab&c".matches(re2));
		//匹配数字
		String re3 = "A\\d";
		System.out.println("匹配数字：");
		System.out.println("A1".matches(re3));
		System.out.println("A*".matches(re3));
		System.out.println("Ab".matches(re3));
		System.out.println("A12".matches(re3));
		//匹配常用字符
		String re4 = "java\\w";
		System.out.println("匹配常用字符：");
		System.out.println("java9".matches(re4));
		System.out.println("javac".matches(re4));
		System.out.println("java_".matches(re4));
		System.out.println("java*".matches(re4));
		//匹配空格字符
		String re5 = "3\\s7";
		System.out.println("匹配空格字符：");
		System.out.println("3 7".matches(re5));
		System.out.println("3\t7".matches(re5));
		System.out.println("307".matches(re5));
		//匹配非数字
		String re6 ="00\\D";
		System.out.println("匹配非数字：");
		System.out.println("006".matches(re6));
		System.out.println("00&".matches(re6));
		System.out.println("00_".matches(re6));
		System.out.println("00A".matches(re6));
		//重复匹配
		String re7 = "A\\d*";
		String re8 = "A\\d+";
		String re9 = "A\\d?";
		String re10 = "A\\d{2}";
		String re11 = "A\\d{3,4}";
		String re12 = "A\\d{2,}";
		String re13 = "A\\d{0,3}";
		System.out.println("重复匹配re7：");
		System.out.println("A00".matches(re7));
		System.out.println("A".matches(re7));
		System.out.println("A000000".matches(re7));
		System.out.println("重复匹配re8：");
		System.out.println("A".matches(re8));
		System.out.println("A1".matches(re8));
		System.out.println("A12".matches(re8));
		System.out.println("A12345".matches(re8));
		System.out.println("重复匹配re9：");
		System.out.println("A".matches(re9));
		System.out.println("A1".matches(re9));
		System.out.println("A12".matches(re9));
		System.out.println("重复匹配re10：");
		System.out.println("A1".matches(re10));
		System.out.println("A12".matches(re10));
		System.out.println("A123".matches(re10));
		System.out.println("重复匹配re11：");
		System.out.println("A123".matches(re11));
		System.out.println("A1234".matches(re11));
		System.out.println("A12".matches(re11));
		System.out.println("A12345".matches(re11));
		System.out.println("重复匹配re12：");
		System.out.println("A1".matches(re12));
		System.out.println("A12".matches(re12));
		System.out.println("A123".matches(re12));
		System.out.println("重复匹配re13：");
		System.out.println("A".matches(re13));
		System.out.println("A123".matches(re13));
		System.out.println("A1234".matches(re13));
		
	}
}
