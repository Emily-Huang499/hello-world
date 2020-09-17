package com.indi.multithreading.test01;

public class MultiThreadingTestTwo {

	public static void main(String[] args) {
		// 方法二：创建Thread实例时，传入一个Runnable实例：
		Thread t = new Thread(new MyRunnable());
		t.start();
	}
}
class MyRunnable implements Runnable{
	@Override
	public void run() {
		System.out.println("start new thread");
	}
}
