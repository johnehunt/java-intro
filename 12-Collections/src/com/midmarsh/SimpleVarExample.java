package com.midmarsh;

import java.util.ArrayList;

public class SimpleVarExample {

	public static void main(String[] args) {
		var name = "John";
		var list = new ArrayList<String>();
		list.add(name);
		list.add("Denise");
		// list.add(42);  // Generates a compile time error
		System.out.println(list);
	}

}
