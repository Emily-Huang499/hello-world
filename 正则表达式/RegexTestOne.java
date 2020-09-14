package tenthc;

public class RegexTestOne {
	public static void main(String[] args) {
		String re1 = "abc";
		System.out.println("abc".matches(re1));
		System.out.println("Abc".matches(re1));
		System.out.println("abcd".matches(re1));
		
		String re2 = "a\\&c";
		System.out.println("a&c".matches(re2));
		System.out.println("a-c".matches(re2));
		System.out.println("a&&c".matches(re2));
	}
}
//	boolean isValidMobileNumber(String s) {
//		if (s.length() != 11) {
//			return false;
//		}
//		for (int i=0; i<s.length(); i++) {
//			char c = s.ch arAt(i);
//			if (c < '0' || c > '9') {
//				return false;
//			}
//		}
//		return true;
//	}
//}
	
