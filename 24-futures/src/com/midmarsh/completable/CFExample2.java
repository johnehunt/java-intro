package com.midmarsh.completable;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CFExample2 {

	public static void main(String[] args) {
		// Create an executor
		ExecutorService executor = Executors.newFixedThreadPool(2);

		System.out.println("Setting up Future");
		// Create the Future
		CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				return "Hello Completable World!";
		}, executor);

		System.out.println("Get value from CompletableFuture");
		try {
			while (!future.isDone()) {
				System.out.println("Waiting ...");
				Thread.sleep(250);
			}
			String msg = future.get();
			System.out.println("Obtained result: " + msg);
		} catch (Exception exp) {
			exp.printStackTrace();
		}

	}

}
