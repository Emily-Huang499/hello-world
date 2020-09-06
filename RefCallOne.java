package thirdc;

public class RefCallOne {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class stdClass = Student.class;
		System.out.println(stdClass.getMethod("getScore", String.class));
		System.out.println(stdClass.getMethod("getName"));
		System.out.println(stdClass.getDeclaredMethod("getGrade", int.class));
	}
}

class Student extends Person{
	public int getScore(String type) {
		return 99;
	}
	private int getGrade(int year) {
		return 1;
	}
}

class Person{
	public String getName() {
		return "Person";
	}
}
