package com.midmarsh.completable;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class CFExample6 {

    public static void main(String[] args) {
        Future<Integer> cf = Calculcator.compose();
        try {
            System.out.println(cf.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}

class Calculcator {
    public static Future<Integer> compose() {
        CompletableFuture<Integer> cf = NumberService.getIntegerAsync();

        CompletableFuture<Integer> cf2 = cf.thenApply(NumberService::doubleIt);

        CompletableFuture<Integer> cf3 = cf2
                .thenCompose(v -> CompletableFuture.supplyAsync(() -> NumberService.squareIt(v)));

        CompletableFuture<Integer> cf4 = cf3
                .thenCompose(v -> CompletableFuture.supplyAsync(() -> NumberService.cubeIt(v)));

        return cf4;
    }
}
