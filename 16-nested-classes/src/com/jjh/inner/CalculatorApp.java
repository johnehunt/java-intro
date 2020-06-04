package com.jjh.inner;

import com.jjh.inner.Calculator.Worker;

public class CalculatorApp {

    public static void main(String[] args) {
        Calculator calc = new Calculator(5);
        Worker worker = calc.getWorker();
        worker.calc();
        System.out.println("calc.getResult(): " + calc.getResult());
    }

}
