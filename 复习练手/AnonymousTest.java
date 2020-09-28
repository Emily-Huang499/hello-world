package com.indi.thread.test;

public class AnonymousTest {

	public static void main(String[] args) {
		Thread t = new Thread(new Runnable() {
			public void run() {
				for (int j = 0; j < 10; j++) {
					System.out.println("分支线程--->" + j);
				}
			}
		});
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("主线程--->" + i);
		}
	}
}
