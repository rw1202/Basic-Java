package com.qa.streaminglists;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(3, 32, 2, 2, 3, 7, 3, 5, 9, 8, 12);

		// numbers.stream().forEach(System.out::println);
		//
		// numbers.stream().sorted().forEach(System.out::println);
		//
		// numbers.stream().filter(number-> (number % 2
		// ==0)).forEach(System.out::println);
		//
		// numbers.stream().map(number -> number * number).forEach(System.out::println);

		numbers.stream().findFirst().ifPresent(System.out::println);
		List<Integer> sortedNumbersSmallestFirst = numbers.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedNumbersSmallestFirst);

		sortedNumbersSmallestFirst.stream().findFirst().ifPresent(System.out::println);

		List<Integer> sqrNumbers = sortedNumbersSmallestFirst.stream().map(i -> i * i).collect(Collectors.toList());

		sortedNumbersSmallestFirst.stream().map(i -> i * 10).forEach(System.out::println);

		System.out.println(sqrNumbers);

		List<Integer> distinctSqrNumbers = sqrNumbers.stream().distinct().collect(Collectors.toList());
		System.out.println(distinctSqrNumbers);

	}

	// TODO Auto-generated method stub

}