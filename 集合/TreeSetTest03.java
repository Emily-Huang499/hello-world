package com.indi.collection.test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest03 {

	public static void main(String[] args) {
		// 创建TreeSet对象
		Set<Integer> ts = new TreeSet<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		});

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
		System.out.println("==============");

		// 自定义类型时比较的第一种方式，使用comparable比较
		TreeSet<A> atree = new TreeSet<>();
		atree.add(new A(8000));
		atree.add(new A(900));
		atree.add(new A(7000));
		atree.add(new A(800));

		for (A a : atree) {
			System.out.println(a);
		}

		System.out.println("==============");
		// 自定义类型时比较的第二种方式，使用comparator比较
//		TreeSet<B> btree = new TreeSet<>(new BComparator());
		TreeSet<B> btree = new TreeSet<>(new Comparator<B>(){
			@Override
			public int compare(B o1, B o2) {
				return o1.i - o2.i;
			}
		});
		btree.add(new B(600));
		btree.add(new B(500));
		btree.add(new B(800));
		btree.add(new B(100));

		for (B b : btree) {
			System.out.println(b);
		}
	}
}

class A implements Comparable<A> {
	int i;

	public A(int i) {
		this.i = i;
	}

	@Override
	public String toString() {
		return "A{" + "i=" + i + "}";
	}

	@Override
	public int compareTo(A o) {
//		return o.i - this.i; //降序
		return this.i - o.i; // 升序
	}
}

class B {
	int i;

	public B(int i) {
		this.i = i;
	}

	@Override
	public String toString() {
		return "B{" + "i=" + i + "}";
	}
}
//
//class BComparator implements Comparator<B> {
//
//	@Override
//	public int compare(B o1, B o2) {
//		return o1.i - o2.i;
//	}
//}