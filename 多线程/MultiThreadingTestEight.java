package com.indi.multithreading.test01;

public class MultiThreadingTestEight {

	public static void main(String[] args) throws Exception{
		var add = new AddThread();
		var dec = new DecThread();
		add.start();
		dec.start();
		add.join();
		dec.join();
		System.out.println(Counter.count);
	}
}

class Counter{
	public static int count = 0;
}

class AddThread extends Thread{
	public void run() {
		for (int i=0; i<10000; i++) {Counter.count += 1;}
	}
}

class DecThread extends Thread{
	public void run() {
		for (int i = 0; i < 10000; i++) {Counter.count -=1;}
	}
}