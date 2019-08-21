package com.midmarsh.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionDemo {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("John");
		List<String> unmodifiableList = Collections.unmodifiableList(list);
		// unmodifiableList.add("Denise"); // throws UnsupportedOptionException
		list.add("Denise");
		unmodifiableList.forEach(s -> System.out.println(s));
	}

}
