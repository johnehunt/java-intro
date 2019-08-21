package com.midmarsh.threading;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ExecutorTest {

    public static void main(String[] args) {
        Executor executor = Executors.newFixedThreadPool(3);
        executor.execute(new RunnableTask("A"));
        executor.execute(new RunnableTask("B"));
        executor.execute(new RunnableTask("C"));
        executor.execute(new RunnableTask("D"));
    }

}

class RunnableTask implements Runnable {
    private String string = "";

    RunnableTask(String st) {
        this.string = st;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.print(string);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }

}
