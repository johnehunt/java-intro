package com.jjh.inner;

public class CalculateFib {

    public void printFibSequence(int number) {

        String separator = ",";

        class Fib {
            private int n1 = 0, n2 = 1, n3;

            public void printFib(int n) {
                for (int i = 2; i < n; ++i) {
                    n3 = n1 + n2;
                    System.out.print(separator + n3);
                    n1 = n2;
                    n2 = n3;
                }
            }
        }

        System.out.print(0 + separator + 1);// printing 0 and 1

        Fib fib = new Fib();
        fib.printFib(number);

    }

}
