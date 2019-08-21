package com.midmarsh.collection;

import java.util.List;

public class CollectionDemo5 {

	public static void main(String[] args) {
		List<String> list1 = List.of("foo", "bar");
		List<String> list2 = List.of("foo", "bar");
		System.out.println(list1 == list2);
	}

}
