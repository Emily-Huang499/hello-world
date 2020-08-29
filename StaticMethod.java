public class StaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("小明");
		System.out.println(Person.getCount()); 
		Person p2 = new Person("小红");
		System.out.println(Person.getCount()); 
		Person p3 = new Person("小军");
		System.out.println(Person.getCount()); 
	}
}
class Person{
	
	String name;
	private static int count=0;
	public static int getCount() {
		return ++count;
	}
	public Person(String name) {
		this.name=name;
	}
}