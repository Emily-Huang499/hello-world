package com.indi.collection.test;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest01 {
	
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("Emily");
		c.add("Johnny");
		c.add("Kris");
		c.add("美人瑜");
		c.add(100);
		System.out.println("集合中元素个数为" + c.size());
		
		c.clear();
		System.out.println("集合中元素个数为" + c.size());
		
		c.add("绿巨人");
		c.add(22);
		c.add("Banana");
		System.out.println(c.contains("绿巨人"));
		System.out.println(c.contains("Apple"));
		
		c.remove(22);
		System.out.println("集合中元素个数为" + c.size());
		
		System.out.println(c.isEmpty());
		
		c.clear();
		System.out.println(c.isEmpty());
		
		c.add("Emily");
		c.add("Johnny");
		c.add("Kris");
		c.add("美人瑜");
		c.add(100);
		Object[] objs = c.toArray();
		for (int i = 0; i < objs.length; i++) {
			Object o = objs[i];
			System.out.println(o);
		}
	}
}
