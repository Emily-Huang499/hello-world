package thirdc;

import java.lang.reflect.Method;

public class RefPoly {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Method h = Person.class.getMethod("hello");
		h.invoke(new Student());
	}
}
 class Person{
	 public void hello() {
		 System.out.println("Person:hello");
	 }
 }

 class Student extends Person{
	 public void hello() {
		 System.out.println("Student:hello");
	 }
 }