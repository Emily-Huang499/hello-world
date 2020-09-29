package com.indi.collection.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest02 {

	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("Aaa");
		c.add("Bbb");
		c.add(123);
		c.add(new Object());
		
		Iterator it = c.iterator();
		
		while(it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
	}

}
