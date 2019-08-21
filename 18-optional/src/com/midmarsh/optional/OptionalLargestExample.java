package com.midmarsh.optional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OptionalLargestExample {

	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(1, -4, -3, 4, -10, 11, 0);
		List<Integer> empty = new ArrayList<>();

		System.out.println(largest(values));
		System.out.println(largest(empty));
	}

	public static int largest(List<Integer> l) {
		return l.stream()
				.sorted((x, y) -> y - x)
				.collect(Collectors.toList())
				.get(0);
	}

}
