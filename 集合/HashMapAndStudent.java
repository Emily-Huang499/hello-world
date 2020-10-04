package com.indi.collection.test;

import java.util.HashSet;
import java.util.Set;

public class HashMapAndStudent {

	public static void main(String[] args) {
		Student s1 = new Student("张三");
		Student s2 = new Student("张三");
		
		System.out.println(s1.equals(s2));
		
		System.out.println("s1的hashCode是：" + s1.hashCode());
		System.out.println("s2的hashCode是：" + s2.hashCode());
		
		Set<Student> students = new HashSet<>();
		students.add(s1);
		students.add(s2);
		
		System.out.println(students.size());
	}

}
