package com.indi.collection.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionTest03 {

	public static void main(String[] args) {
		List<String> myList = new ArrayList();
		myList.add("Hello");
		myList.add("world!");
		myList.add("kitty!");
		
		//使用for循环
		for (int i = 0; i < myList.size(); i++) {
			System.out.println(myList.get(i));
		}
		
		//使用迭代器
		Iterator<String> it = myList.iterator();
		while(it.hasNext()) {
			String s =  it.next();
			System.out.println(s);
		}
		
		//使用foreach
		for(String data: myList) {
			System.out.println(data);
		}
	}

}
