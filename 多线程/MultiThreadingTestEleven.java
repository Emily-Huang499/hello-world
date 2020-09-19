package com.indi.multithreading.test01;

public class MultiThreadingTestEleven {

	public static void main(String[] args) throws Exception {
		var ts = new Thread[] { new AddStudentThread(), new DecStudentThread(), new AddTeacherThread(), new DecTeacherThread()};
		for (var t : ts) {
			t.start();
		}
		for (var t : ts) {
			t.join();
		}
		System.out.println(Counter.studentCount);
		System.out.println(Counter.teacherCount);
		}
}

class Counter{
	public static final Object lock = new Object();
	public static int studentCount = 0;
	public static int teacherCount = 0;
}

class AddStudentThread extends Thread{
	public void run() {
		for (int i = 0; i < 10000; i++) {
			synchronized (Counter.lock) {
				Counter.studentCount +=1;
			}
		}
	}
}

class DecStudentThread extends Thread{
	public void run() {
		for (int i = 0; i < 10000; i++) {
			synchronized (Counter.lock) {
				Counter.studentCount -=1;
			}
		}
	}
}

class AddTeacherThread extends Thread{
	public void run() {
		for (int i = 0; i < 10000; i++) {
			synchronized (Counter.lock) {
				Counter.teacherCount += 1;
			}
		}
	}
}

class DecTeacherThread extends Thread{
	public void run() {
		for (int i = 0; i < 10000; i++) {
			synchronized (Counter.lock) {
				Counter.teacherCount -= 1;
			}
		}
	}
}