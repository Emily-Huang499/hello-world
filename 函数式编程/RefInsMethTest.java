package com.indi.function.test;

import java.util.Arrays;

public class RefInsMethTest {

	public static void main(String[] args) {
		String[] array = new String[] { "Apple", "Orange", "Banana", "Lemon" };
        Arrays.sort(array, String::compareTo);
        System.out.println(String.join(", ", array));
    }
}