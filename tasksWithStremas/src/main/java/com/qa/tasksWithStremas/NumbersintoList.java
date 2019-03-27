package com.qa.tasksWithStremas;

import java.util.ArrayList;
import java.util.List;

public class NumbersintoList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		numbersIntoList();
	}

	static void numbersIntoList() {

		List<Integer> numberList = new ArrayList<Integer>();

		for (int i = 1; i <= 1000; i++)

			numberList.add(i);

		System.out.println(numberList);

	}

}
