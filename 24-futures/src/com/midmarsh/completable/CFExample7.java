package com.midmarsh.completable;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CFExample7 {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        CompletableFuture<String> f1 = CompletableFuture.supplyAsync(() -> {
            return "Hello";
        }, executor);

        CompletableFuture<String> f2 = CompletableFuture.supplyAsync(() -> {
            return "World";
        }, executor);

        CompletableFuture<String> f3 = f1.thenCombine(f2, (x, y) -> x + " " + y);

        f3.thenAccept(System.out::println);

    }

}
