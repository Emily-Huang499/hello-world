package com.indi.collection.test;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest02 {

	public static void main(String[] args) {

		// 创建TreeSet对象
		Set<Integer> ts = new TreeSet<>();

		// 向其中添加元素
		ts.add(100);
		ts.add(90);
		ts.add(1000);
		ts.add(400);
		ts.add(300);
		ts.add(400);

		// 遍历（迭代器方式）
		Iterator<Integer> it = ts.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());// 可排序，不可重复
		}

		System.out.println("==============");

		// 遍历（forEach）
		for (Integer t : ts) {
			System.out.println(t);
		}
	}
}

