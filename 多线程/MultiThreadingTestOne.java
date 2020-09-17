package com.indi.multithreading.test01;

public class MultiThreadingTestOne {
	//方法一：从Thread派生一个自定义类，然后覆写run()方法：
	public static void main(String[] args) {
		Thread t = new MyThread();
		t.start();
	}
}
class MyThread extends Thread{
	@Override
	public void run() {
		System.out.println("start new thread");
	}
}