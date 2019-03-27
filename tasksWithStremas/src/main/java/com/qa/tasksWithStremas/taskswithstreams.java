package com.qa.tasksWithStremas;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;

public class taskswithstreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		numbersIntoList();
	}

	static void numbersIntoList() {

		List<Integer> numberList = new ArrayList<>();

		for (int i = 1; i <= 1000; i++)

			numberList.add(i);

		// System.out.println(numberList);

		numberList.stream().forEach(System.out::println);
		IntSummaryStatistics stats = numberList.stream().collect(IntSummaryStatistics::new,
				IntSummaryStatistics::accept, IntSummaryStatistics::combine);
		System.out.println(stats);

	}

}
