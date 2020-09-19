package com.indi.multithreading.test02;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureTestTwo {

	public static void main(String[] args) throws Exception{
		CompletableFuture<String> cfQuery = CompletableFuture.supplyAsync(() -> {
			return queryCode("中国石油");
		});
		CompletableFuture<Double> cfFetch = cfQuery.thenApply((code) -> {
			return fetchPrice(code);
		});
		cfFetch.thenAccept((result) -> {
			System.out.println("price: " + result);
		});
		Thread.sleep(2000);
	}
	
	static String queryCode(String name) {
		try {
			Thread.sleep(100);
		}catch(InterruptedException e) {}
		return "601857";
	}
	
	static Double fetchPrice(String code) {
		try {
			Thread.sleep(100);
		}catch(InterruptedException e) {}
		return 5 + Math.random() * 20;
	}

}
