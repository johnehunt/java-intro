package com.midmarsh.func;

public class SampleFuncApp3 {
    Runnable func = () -> System.out.println(this);

    public static void main(String[] args) {
        SampleFuncApp3 app = new SampleFuncApp3();
        app.func.run();
    }

}
