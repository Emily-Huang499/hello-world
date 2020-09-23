package com.indi.emily.test02;

import java.lang.reflect.Method;

public class ReflectionTestThree {

	public static void main(String[] args) throws Exception{
		 Method h = Person.class.getMethod("hello");
	        h.invoke(new Student());
	    }
	}

	class Person {
	    public void hello() {
	        System.out.println("Person:hello");
	    }
	}

	class Student extends Person {
	    public void hello() {
	        System.out.println("Student:hello");
	    }
	}
	