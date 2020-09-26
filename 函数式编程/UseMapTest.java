package com.indi.function.test;

import java.util.List;

public class UseMapTest {

	public static void main(String[] args) {
		List.of("  Apple ", " pear ", " ORANGE", " BaNaNa ")
        .stream()
        .map(String::trim)
        .map(String::toLowerCase)
        .forEach(System.out::println);
}
	}