package com.indi.function.test;

import java.util.List;
import java.util.stream.Collectors;

public class FunctionTest {

	public static void main(String[] args) {
		List<String> names = List.of("Bob", "Alice", "Tim");
        List<Person> persons = names.stream().map(Person::new).collect(Collectors.toList());
        System.out.println(persons);
    }
}

class Person {
    String name;
    public Person(String name) {
        this.name = name;
    }
    public String toString() {
        return "Person:" + this.name;
    }
}