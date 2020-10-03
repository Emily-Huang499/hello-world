package tests;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetReview {

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<>();

		ts.add("Hello");
		ts.add("Emily");
		ts.add("Angela");
		ts.add("Johnny");
		ts.add("Kris");

		for (String s : ts) {
			System.out.println(s);
		}

		System.out.println("========");

		TreeSet<A> atree = new TreeSet<>();
		atree.add(new A(987));
		atree.add(new A(897));
		atree.add(new A(654));
		atree.add(new A(456));

		for (A as : atree) {
			System.out.println(as);
		}
		System.out.println("========");

		TreeSet<B> btree = new TreeSet<>(new Comparator<B>() {
			@Override
			public int compare(B o1, B o2) {
				return o1.t - o2.t;
			}
		});
		btree.add(new B(100));
		btree.add(new B(200));
		btree.add(new B(50));
		btree.add(new B(150));

		for (B b : btree) {
			System.out.println(b);
		}
	}
}

class A implements Comparable<A> {
	int s;

	public A(int s) {
		this.s = s;
	}

	@Override
	public String toString() {
		return "A{" + "s=" + s + "}";
	}

	@Override
	public int compareTo(A o) {
		return this.s - o.s;
	}
}

class B {
	int t;

	public B(int t) {
		this.t = t;
	}

	@Override
	public String toString() {
		return "B{" + "t=" + t + "}";
	}
}
