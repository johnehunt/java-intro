package com.midmarsh;

import java.util.ArrayList;
import java.util.List;

public class SimpleDiamondSyntaxExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("John");
		list.add("Denise");
		 // list.add(42); // Generates a compile time error
        System.out.println(list);
	}

}
