package com.midmarsh.calc;

public class Calculator {
    
    private int memory = 0;
    private int total = 0;
    
    public Calculator() {
        
    }
    
    public void clearMemory() {
        this.memory = 0;
    }
    
    public void clearTotal() {
        this.total = 0;
    }
    
    public void add(int value) {
        this.total = total + value;
    }
    
    public void subtract(int value) {
        this.total = total - value;
    }
    
    public void addToMemory() {
        this.memory = this.memory + this.total;
    }
    
    public void subtractFromMemory() {
        this.memory = this.memory - this.total;
    }
    
    public int getTotal() {
        return this.total;
    }
    
    public int getMemory() {
        return this.memory;
    }

}
