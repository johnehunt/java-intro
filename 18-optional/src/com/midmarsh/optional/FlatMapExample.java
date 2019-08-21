package com.midmarsh.optional;

import java.util.*;

public class FlatMapExample {

	public static void main(String[] args) {
		System.out.println(Capitals.getCapital("UK")
				.flatMap(Populations::getPopulation).orElse(-1));

		System.out.println(Capitals.getCapital("China")
				.flatMap(Populations::getPopulation).orElse(-1));
	}

}

class Populations {
	
	private static Map<String, Integer> populations = new HashMap<>();
	
	static {
	 populations.put("London", 8_000_000);
	 populations.put("Washington DC", 6_000_000);
	 populations.put("Beijing", 20_000_000);
	}

	public static Optional<Integer> getPopulation(String key) {
		return Optional.ofNullable(populations.get(key));
	}
	
}
