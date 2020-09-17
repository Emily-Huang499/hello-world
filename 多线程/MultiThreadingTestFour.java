package com.indi.multithreading.test01;

public class MultiThreadingTestFour{

	public static void main(String[] args) throws InterruptedException  {
//		Thread t = new Thread(()-> {
//			System.out.println("hello");
//		});
		Thread t = new Thread(new Runnable() {
			public void run() {
				System.out.println("hello");
			}
		});
		System.out.println("start");
		t.start();
		t.join();
		System.out.println("end");
	}
}