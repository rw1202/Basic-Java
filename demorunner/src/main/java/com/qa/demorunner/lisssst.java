package com.qa.demorunner;

import java.util.Arrays;
import java.util.List;

public class lisssst {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		List<Integer> numbers = Arrays.asList(3, 32, 2, 2, 3, 7, 3, 5, 9, 8, 12);

		for (int number : numbers) {
			System.out.println(number);
		}
		for (int number : numbers)
			if (number % 2 == 0)
				System.out.println(number);

		for (int number : numbers) {
			System.out.println(number * 10);
		}

		int highest = 0;

		for (int number : numbers) {

			if (number > highest)
				highest = number;

		}
		System.out.println(highest);

		int lowest = 1000;

		for (int number : numbers) {

			if (number < lowest)
				lowest = number;
		}
		System.out.println(lowest);

		String sq = "Squared";

		System.out.println(sq);
		{
			for (int number : numbers) {

				int squared = number * number;

				System.out.println(squared);

				List<Integer> square = Arrays.asList(squared);

				System.out.println(square);

			}

		}
	}

}
