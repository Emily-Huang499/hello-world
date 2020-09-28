package com.indi.review.test01;

public class RecursionTest01 {

	public static void main(String[] args) {
		int n =5;
		int retValue = sum(n);
		System.out.println(retValue);
	}

	public static int sum(int n) {
	if(n == 1) {
		return 1;
	}
	return n + sum(n - 1);
	}
}