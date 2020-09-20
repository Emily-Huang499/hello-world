package com.indi.emily.test02;

public class InterfaceTestTwo {

	public static void main(String[] args) {
		Person p = new Student("Emily");
        p.run();
    }
}

interface Person {
    String getName();
    default void run() {
        System.out.println(getName() + " run");
    }
}

class Student implements Person {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}		
