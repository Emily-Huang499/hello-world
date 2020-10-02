package com.indi.collection.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest02 {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Emily");
		map.put(2, "Angela");
		map.put(3, "Johnny");
		map.put(4, "Kris");

		Set<Map.Entry<Integer, String>> set = map.entrySet();
		// 使用迭代器
		Iterator<Map.Entry<Integer, String>> it2 = set.iterator();
		while (it2.hasNext()) {
			Map.Entry<Integer, String> node = it2.next();
			Integer key = node.getKey();
			String value = node.getValue();
			System.out.println(key + "=" + value);
		}
		// 使用forEach
		for (Map.Entry<Integer, String> node : set) {
			System.out.println(node.getKey() + "--->" + node.getValue());
		}
	}
}
