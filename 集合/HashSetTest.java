package com.indi.collection.test;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		Set<String> strs = new HashSet<>();
		//无序不可重复
		strs.add("A");
		strs.add("D");
		strs.add("B");
		strs.add("K");
		strs.add("A");
		strs.add("C");
		strs.add("Q");
		strs.add("Q");
		
		for(String data : strs) {
			System.out.println(data);
		}
	}

}
