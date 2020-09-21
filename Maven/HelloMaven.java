package com.indi.maven.test01;

public class HelloMaven {

	public static void main(String[] args) {
		HelloMaven hm = new HelloMaven();
		int res = hm.add(10, 20);
		System.out.println("10 + 20 = " + res);
	}
	public int add(int n1, int n2) {
		return n1 + n2;
	}
}
