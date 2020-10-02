package com.indi.collection.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Emily");
		map.put(2, "Angela");
		map.put(3, "Johnny");
		map.put(4, "Kris");
		Set<Integer> keys = map.keySet();
		//使用Iterator
		Iterator<Integer> it = keys.iterator();
		while(it.hasNext()) {
			Integer key = it.next();
			String value = map.get(key);
			System.out.println(key + "=" + value);
		}
		//使用forEach
		for(Integer key : keys) {
			System.out.println(key + "---->" + map.get(key));
		}
	}

}
