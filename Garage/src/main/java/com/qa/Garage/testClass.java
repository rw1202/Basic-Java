package com.qa.Garage;

import java.util.Random;

public class testClass {

	public static void main(String[] args) {

		Random rn = new Random();
		int answer = rn.nextInt(10) + 1;

		System.out.println(answer);
	}
}
