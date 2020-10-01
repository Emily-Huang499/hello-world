package com.indi.collection.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericAndCollection {

	public static void main(String[] args) {
		List myList = new ArrayList();

		Bird b = new Bird();
		Cat c = new Cat();

		myList.add(b);
		myList.add(c);

		Iterator<Animal> it = myList.iterator();
		while (it.hasNext()) {
			Animal a = it.next();
			if (a instanceof Bird) {
				Bird x = (Bird) a;
				x.fly();
			}
			if (a instanceof Cat) {
				Cat y = (Cat) a;
				y.catchMouse();
			}
		}
	}
}

class Animal {
	public void move() {
		System.out.println("动物在移动");
	}
}

class Bird extends Animal {
	public void fly() {
		System.out.println("鸟儿在飞翔");
	}
}

class Cat extends Animal {
	public void catchMouse() {
		System.out.println("猫捉老鼠");
	}
}
