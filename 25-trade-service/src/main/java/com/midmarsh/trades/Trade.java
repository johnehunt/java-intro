package com.midmarsh.trades;

public class Trade {
    
    private String id;
    private String symbol;
    private int quantity;
    
    /**
     * Requires Zero param constructor for conversion to JSON
     */
    public Trade() { }
    
    public Trade(String id, String symbol, int quantity) {
        super();
        this.id = id;
        this.symbol = symbol;
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String toString() {
        return String.format("Trade [id=%s, symbol=%s, quantity=%s]", id, symbol, quantity);
    }
    
}
