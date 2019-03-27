package com.qa.calculate;

public class Calculator {

	static calculateOperation addition = (a, b) -> a + b;

	calculateOperation subtraction = (a, b) -> a - b;

	calculateOperation multiplication = (a, b) -> a * b;

	calculateOperation division = (a, b) -> a / b;

	public static void main(String[] args) {

		System.out.println(addition.operation(4, 5));

	}
}
