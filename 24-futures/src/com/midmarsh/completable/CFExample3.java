package com.midmarsh.completable;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CFExample3 {

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
            return "Hello Completable World!";
        }, executor);
        //
        future.thenAccept(System.out::println);

    }

}
