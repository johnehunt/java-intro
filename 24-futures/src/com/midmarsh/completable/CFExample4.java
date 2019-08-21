package com.midmarsh.completable;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CFExample4 {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        System.out.println("Setting up Future");
        // Create the Future
        CompletableFuture<Integer> f1 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return 6;
        }, executor);
        // Combine operations together
        CompletableFuture<Integer> f2 = f1.thenApply(v -> v * 7);
        CompletableFuture<String> f3 = f2.thenApply(v -> Integer.toString(v));
        // Finally print result
        f3.thenAccept(System.out::println);

    }

}
