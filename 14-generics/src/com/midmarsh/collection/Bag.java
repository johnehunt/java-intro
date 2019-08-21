package com.midmarsh.collection;

public class Bag<E> {
    
    private E data;
    
    public void put(E x) {
        data = x;
    }
    
    public boolean isEmtpy() {
        return data == null;
    }
   
    public E get() {
        return data;
    }

}
