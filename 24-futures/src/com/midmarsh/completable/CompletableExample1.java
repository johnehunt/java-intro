package com.midmarsh.completable;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class CompletableExample1 {

	public static void main(String[] args) {
		Future<Integer> future = NumberService.getIntegerAsync();
		int num = 0;
		try {
			while (!future.isDone()) {
				System.out.println("Doing something");
				Thread.sleep(250);
			}
			num = future.get();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
		System.out.println("Fetched Value: " + num);
	}

}

class NumberService {

	public static Future<Integer> getIntegerFuture() {
		CompletableFuture<Integer> future = new CompletableFuture<>();

		new Thread(() -> {
			sleep();
			future.complete(125);
		}).start();

		return future;
	}

	public static CompletableFuture<Integer> getIntegerAsync() {
		return CompletableFuture.supplyAsync(() -> fetchInteger());
	}

	private static Integer fetchInteger() {
		sleep();
		return 5;
	}

	private static void sleep() {
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Integer doubleIt(Integer x) {
		return x * 2;
	}
	
	public static Integer squareIt(Integer x) {
		return x * x;
	}
	
	public static Integer cubeIt(Integer x) {
		return x * x * x;
	}

}
