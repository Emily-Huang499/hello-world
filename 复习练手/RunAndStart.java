package com.indi.thread.test;

public class RunAndStart {

	public static void main(String[] args) {
		MyThread mt = new MyThread();
		mt.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("主线程--->" + i);
		}
	}
}
class MyThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("分支线程--->" + i);
		}
	}
}
