package com.midmarsh;

import java.util.ArrayDeque;
import java.util.Queue;

public class SampleQueueApp {

    public static void main(String[] args) {
        Queue<String> queue = new ArrayDeque<>();
        queue.add("John");
        queue.add("Denise");
        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
    }

}
