package com.jjh.inner;

public class Calculator {

    private int value;
    private int result;

    public Calculator(int value) {
        this.value = value;
    }

    protected class Worker {
        public void calc() {
           for (int i = 0; i< value; i++) {
               result = result + i;
           }
        }
    }
    
    public Worker getWorker() {
        return new Worker();
    }
    
    public int getResult() {
        return result;
    }

}
