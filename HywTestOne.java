package tests;

import java.util.Arrays;

public class MyTestOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person[] ps = new Person[] {
				new Person("Bob", 100),
				new Person("Alice", 75),
				new Person("Johnny", 90)
		};
		Arrays.sort(ps);
		System.out.println(Arrays.toString(ps));
	}
}
class Person implements Comparable<Person>{
	String name;
	int score;
	Person(String name, int score){
		this.name = name;
		this.score = score;
	}
//	public int CompareTo(Person other) {
//		return this.name.compareTo(other.name);
//	}
	public int CompareTo(Person other) {
		return this.score - other.score;
	}
	public String toString() {
		return this.name + "," + this.score;
	}
	@Override
	public int compareTo(Person o) {
		// return 0；
		return new Integer(this.score).compareTo(new Integer(o.score));
	}
}
