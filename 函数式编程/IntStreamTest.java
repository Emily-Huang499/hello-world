package com.indi.function.test;

import java.util.stream.IntStream;

public class IntStreamTest {

	public static void main(String[] args) {
		IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
        .filter(n -> n % 2 != 0)
        .forEach(System.out::println);
}
	}