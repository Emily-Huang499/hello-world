package thirdc;

public class RefClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printClassInfo("".getClass());
		printClassInfo(Runnable.class);
		printClassInfo(java.time.Month.class);
		printClassInfo(String[].class);
		printClassInfo(int.class);
	}
	static void printClassInfo(Class cls) {
		System.out.println("Class name: " + cls.getName());
		System.out.println("Simple name: " + cls.getSimpleName());
		if (cls.getPackage() != null) {
			System.out.println("Package name: " + cls.getPackage().getName());
		}
		System.out.println("is interface: " + cls.isInterface());
		System.out.println("is enum: " +cls.isEnum());
		System.out.println("is array: " + cls.isArray());
		System.out.println("is primitive: " + cls.isPrimitive());
	}

}
