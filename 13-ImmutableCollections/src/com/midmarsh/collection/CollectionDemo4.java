package com.midmarsh.collection;

import java.util.Map;

public class CollectionDemo4 {

	public static void main(String[] args) {
		Map<Object, Object> emptyMap = Map.of();
		System.out.println("emptyMap: " + emptyMap);

		Map<String, String> cities = Map.of("England", "London", "Wales", "Cardiff", "Ireland", "Dublin");
		System.out.println("Cities: " + cities);

		Map<String, String> songs = 
			Map.ofEntries(
				Map.entry("Adele", "Hello"), 
				Map.entry("Madonna", "La Isla Bonita"),
				Map.entry("Sting", "Fields of Gold"));
		System.out.println("Songs: " + songs);
	}

}
