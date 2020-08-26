public class Overload {

	public static void main(String[] args) {
		Person ming = new Person();
		ming.setName("Xiao Ming");
		System.out.println(ming.getName());
		Person hong = new Person();
		hong.setName("Xiao" , "Hong");
		System.out.println(hong.getName());
	}
}
class Person{
	private String name;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setName(String name1,String name2) {
		this.name = name1 + ' ' +name2; 
	}
}