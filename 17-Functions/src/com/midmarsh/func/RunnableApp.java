package com.midmarsh.func;

public class RunnableApp {

    public static void main(String[] args) {
        var runner = new Runner();
        runner.run();
    }

}

class Runner implements Runnable {
    public void run() {
        System.out.println("I am running");
    }
}
