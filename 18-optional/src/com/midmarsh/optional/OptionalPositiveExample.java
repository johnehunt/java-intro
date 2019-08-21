package com.midmarsh.optional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OptionalPositiveExample {

	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(1,-4, -3, 4, -10, 11, 0);
		 List<Integer> allNegative = Arrays.asList(-1, -4, -3, -4,-10, -11);
		 System.out.println( largestPositive(values) );
		 System.out.println( largestPositive(allNegative) );
	}
	
	public static int largestPositive(List<Integer> l ) {
		  return l.stream()
		      .filter(i -> i >= 0 )
		      .sorted((x,y) -> y - x)
		      .collect(Collectors.toList())
		      .get(0);
		 }


}
