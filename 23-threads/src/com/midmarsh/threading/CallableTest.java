package com.midmarsh.threading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableTest {

    public static void main(String[] args) {

        Callable<Integer> callable = new Callable<Integer>() {
            public Integer call() throws Exception {
                Thread.sleep(100);
                return 42;
            }
        };

        ExecutorService es = Executors.newFixedThreadPool(4);
        Future<Integer> future = es.submit(callable);
        try {
            // Waits until a result is provided
            int result = future.get();
            System.out.println("Result from future.get () = " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
        es.shutdown();
    }

}
