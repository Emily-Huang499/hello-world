package com.indi.collection.test;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		Set<Integer> ints = new TreeSet<>();
		ints.add(123);
		ints.add(654);
		ints.add(456);
		ints.add(2);
		ints.add(4);
		ints.add(123);
		
		Iterator<Integer> it = ints.iterator();
		while(it.hasNext()) {
			Integer i = it.next();
			System.out.println(i);
		}
	}

}
