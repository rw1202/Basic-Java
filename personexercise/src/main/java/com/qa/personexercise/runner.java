package com.qa.personexercise;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class runner {
	public static void main(String[] args) {

		persons p1 = new persons("James", 45, "Scrum Master");

		System.out.println(p1.toString());

		persons p2 = new persons("David", 20, "Software Developer");

		System.out.println(p2.toString());

		persons p3 = new persons("Tim", 25, "Consultant");

		System.out.println(p3.toString());

		ArrayList<persons> personsList = new ArrayList<persons>();

		personsList.add(p1);
		personsList.add(p2);
		personsList.add(p3);

		personsList.stream().forEach(System.out::println);

		List<persons> personSearch = personsList.stream().filter(p -> p.getAge() == (45)).collect(Collectors.toList());
		System.out.println(personSearch);

	}

}
