package com.midmarsh.optional;

import java.util.*;

public class MapOptionalExample {

	public static void main(String[] args) {
		System.out.println(Capitals.getCapital("UK"));
		System.out.println(Capitals.getCapital("UK").get());
		System.out.println(Capitals.getCapital("UK").get().toUpperCase());
		System.out.println(Capitals.getCapital("UK").map(String::toUpperCase));

		System.out.println(Capitals.getCapital("China"));
		// System.out.println(Capitals.getCapital("China").get().toUpperCase()); 
		System.out.println(Capitals.getCapital("China").map(String::toUpperCase));
		System.out.println(Capitals.getCapital("China").orElse("Unnown"));
		System.out.println(Capitals.getCapital("China").map(String::toUpperCase).orElse("UNKNOWN"));
	}

}

class Capitals {
	private static Map<String, String> capitals = new HashMap<>();

	static {
		capitals.put("UK", "London");
		capitals.put("USA", "Washington DC");
		capitals.put("India", "New Delhi");
	}

	public static Optional<String> getCapital(String key) {
		return Optional.ofNullable(capitals.get(key));
	}

}
