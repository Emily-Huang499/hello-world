package com.indi.function.test;

import java.util.Arrays;

public class DirectInputTest {

	public static void main(String[] args) {
		String[] array = new String[] { "Apple", "Orange", "Banana", "Lemon" };
        Arrays.sort(array, DirectInputTest::cmp);
        System.out.println(String.join(", ", array));
    }

    static int cmp(String s1, String s2) {
        return s1.compareTo(s2);
    }
}