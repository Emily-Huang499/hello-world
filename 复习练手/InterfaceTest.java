package com.indi.emily.test02;

public class InterfaceTest {

	public static void main(String[] args) {
		Wing w = new Pig();
		w.fly();
	}
}

interface Wing {
	void fly();
}

class Pig implements Wing {
	public void fly() {
		System.out.println("我是一只渴望飞翔的猪！");
	}
}