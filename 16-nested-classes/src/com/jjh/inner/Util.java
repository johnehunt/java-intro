package com.jjh.inner;

public class Util {
    
    public static class Printer {
        public void print(String msg) {
            System.out.println(this.getClass().getName() + " - " +msg);
        }
    }
    
    public static interface Printable {
        String convert();
    }
    
    public static abstract class DefaultPrintable implements Printable {
        abstract String getName();
    }

}
