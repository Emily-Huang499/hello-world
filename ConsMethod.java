public class ConsMethod {

	public static void main(String[] args) {
		ConsMethod cm = new ConsMethod();
		Person ming = cm.new Person("小明", 12);
		System.out.println(ming.getName());
		System.out.println(ming.getAge());
		}
class Person{
	private String name;
	private int age;
	
	public String getName() {
		return this.name;
		}
	public int getAge() {
		return this.age;
		}
	public Person(String name,int age) {
		this.name=name;
		this.age=age;
		}
	}
}	