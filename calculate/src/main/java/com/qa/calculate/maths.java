package com.qa.calculate;

public class maths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculateOperation addition = (a, b) -> a + b;

		System.out.println(addition.operation(5, 10));

		calculateOperation subtraction = (a, b) -> a - b;

		System.out.println(subtraction.operation(3, 10));

		calculateOperation multiplication = (a, b) -> a * b;

		System.out.println(multiplication.operation(9, 5));

		calculateOperation division = (a, b) -> a / b;

		System.out.println(division.operation(10, 5));

		CalculateOperation2 square = (a) -> a * a;

		System.out.println(square.operation(3));

		CalculateOperation2 root = (a) -> Math.sqrt(a);

		System.out.println(root.operation(9));

		calculateOperation3 addition2 = (a, b, c) -> a + b + c;

		System.out.println(addition2.operation(2, 3, 1));

	}

}
