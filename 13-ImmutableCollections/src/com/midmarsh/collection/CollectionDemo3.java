package com.midmarsh.collection;

import java.util.Set;

public class CollectionDemo3 {

	public static void main(String[] args) {

		Set<Object> set0 = Set.of();
		System.out.println("set0: " + set0);

		Set<Integer> set1 = Set.of(25, 40, 75);
		System.out.println("set1:" + set1);

		// Set.of() variant#2
		Integer[] intArray = { 1, 2, 3, 4 };
		Set<Integer> set2 = Set.of(intArray);
		System.out.println("set2:" + set2);

	}

}
