package com.midmarsh.completable;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CFExample5 {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        System.out.println("Setting up Future");
        // Create the Future
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Hello World";
        }, executor);

        CompletableFuture<String> safe = future.exceptionally(ex -> "We have a problem: " + ex.getMessage());

        safe.thenAccept(System.out::println);

    }

}
