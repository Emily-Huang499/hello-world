package com.indi.function.test;

import java.util.stream.Stream;

public class SteamOfTest {

	public static void main(String[] args) {
		Stream<String> stream = Stream.of("A", "B", "C", "D");
        stream.forEach(System.out::println);
    }
}
