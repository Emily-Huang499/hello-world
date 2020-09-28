package com.indi.review.test01;

public class RecursionTest02 {

	public static void main(String[] args) {
		int n = 5;
		int retValue = multi(n);
		System.out.println(retValue);
	}
	public static int multi(int n) {
		if (n == 1) {
			return 1;
		}
		return n * multi(n - 1);
	}
}
