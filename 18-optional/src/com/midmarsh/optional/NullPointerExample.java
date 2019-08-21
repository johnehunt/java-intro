package com.midmarsh.optional;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NullPointerExample {
	public static void main(String[] args) {
		Trader trader = new Trader("ABC123", "John");

		System.out.println(trader.getPortfilio().getAsset(0).getSymbol().getValue());
	}
}


class Trader {
	private String MSID;
	private String name;
	private Portfolio portfilio;
	
	public Trader(String mSID, String name) {
		super();
		MSID = mSID;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMSID() {
		return MSID;
	}

	public Portfolio getPortfilio() {
		return portfilio;
	}

	public void setPortfilio(Portfolio portfilio) {
		this.portfilio = portfilio;
	}
	
}

class Portfolio {
	private String id;
	private List<Asset> assets = new ArrayList<>();
	public Portfolio(String id) {
		this.id = id;
	}
	public boolean isEmpty() {
		return assets.isEmpty();
	}
	public boolean contains(Object o) {
		return assets.contains(o);
	}
	public Iterator<Asset> iterator() {
		return assets.iterator();
	}
	public boolean addAsset(Asset e) {
		return assets.add(e);
	}
	public boolean removeAsset(Object o) {
		return assets.remove(o);
	}
	public Asset getAsset(int index) {
		return assets.get(index);
	}
	public void clear() {
		assets.clear();
	}
}

class Asset {
	private Symbol symbol;

	public Asset(Symbol symbol) {
		this.symbol = symbol;
	}

	public Symbol getSymbol() {
		return symbol;
	}
	
}

class Symbol {
	private String value = "";

	public Symbol(String sym) {
		this.value = sym;
	}

	public String getValue() {
		return value;
	}
	
}