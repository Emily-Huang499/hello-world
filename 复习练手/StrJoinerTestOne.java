package com.indi.emily.test02;

import java.util.StringJoiner;

public class StrJoinerTestOne {

	public static void main(String[] args) {
		String[] names = {"Bob", "Alice", "Grace"};
        var sj = new StringJoiner(", ");
        for (String name : names) {
            sj.add(name);
        }
        System.out.println(sj.toString());
    }
}
	