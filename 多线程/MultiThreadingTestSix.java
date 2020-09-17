package com.indi.multithreading.test01;

public class MultiThreadingTestSix {

	public static void main(String[] args) throws InterruptedException{
		Thread t = new MyThread();
		t.start();
		Thread.sleep(100);
		t.interrupt();
		t.join();
		System.out.println("end");
	}
}
class MyThread extends Thread{
	public void run() {
		Thread hello = new HelloThread();
		hello.start();
		try {
			hello.join();
		}catch(InterruptedException e) {
		System.out.println("Interrupt!");
		}
		hello.interrupt();
	}
}
class HelloThread extends Thread{
	public void run() {
		int n = 0;
		while(!interrupted()) {
			n++;
			System.out.println(n + "hello!");
		try {
			Thread.sleep(100);
		}catch(InterruptedException e) {
			break;
			}
		}
	}
}