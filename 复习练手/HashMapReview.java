package com.indi.collection.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapReview {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();

		map.put(123, "张三");
		map.put(234, "李四");
		map.put(345, "王五");
		map.put(456, "赵六");
		map.put(123, "Emily");

		System.out.println(map.size());
		System.out.println(map.get(456));

		System.out.println("========");

		// 取出的第一种方式,先获取所有的key,通过key获取相应的value
		Set<Integer> keys = map.keySet();
		for (Integer key : keys) {
			System.out.println(key + "=" + map.get(key));
		}

		System.out.println("========");

		// 取出的第二种方式,将map集合转化为set集合，set集合中每一个元素是node
		// 这个node节点中有key和value
		Set<Map.Entry<Integer, String>> nodes = map.entrySet();
		for (Map.Entry<Integer, String> node : nodes) {
			System.out.println(node.getKey() + "=" + node.getValue());
		}
	}

}
