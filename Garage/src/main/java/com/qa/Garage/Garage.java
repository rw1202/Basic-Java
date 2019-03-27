package com.qa.Garage;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Garage {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Vehicle c1= new Vehicle Audi, 2, 100;

		Car c1 = new Car("Audi", 2, 100, 4, "per");

		Bicycle b1 = new Bicycle("ray", 1, 30, "po");

		Mortorbike m1 = new Mortorbike("yam", 3, 110, "per");

		ArrayList<Vehicle> vList = new ArrayList<>();

		vList.add(b1);
		vList.add(m1);
		vList.add(c1);

		List<Vehicle> highTopSpeedList = vList.stream().filter(p -> (p.gettopSpeed() > 99))
				.collect(Collectors.toList());
		System.out.println(highTopSpeedList);

		List<Integer> highTopSpeedPriceList = highTopSpeedList.stream().map(p -> (p.gettopSpeed() * 8))
				.collect(Collectors.toList());

		System.out.println(highTopSpeedPriceList);

		List<Vehicle> fastCarList = highTopSpeedList.stream().filter(p -> (p == c1)).collect(Collectors.toList());

		List<Vehicle> fastMbList = highTopSpeedList.stream().filter(p -> (p == m1)).collect(Collectors.toList());

		List<Vehicle> fastBcList = highTopSpeedList.stream().filter(p -> (p == b1)).collect(Collectors.toList());

		List<Integer> priceFastCarsList = fastCarList.stream().map((p -> (p.gettopSpeed() * 8)))
				.collect(Collectors.toList());
		List<Integer> priceFastMbList = fastMbList.stream().map((p -> (p.gettopSpeed() * 10)))
				.collect(Collectors.toList());
		List<Integer> priceFastBcList = fastBcList.stream().map((p -> (p.gettopSpeed() * 3)))
				.collect(Collectors.toList());

		System.out.println(priceFastCarsList);
		System.out.println(priceFastMbList);
		System.out.println(priceFastBcList);

		if (b1 instanceof Bicycle) {
			System.out.println("b1+50");

		}

		if (m1 instanceof Mortorbike) {
			System.out.println("m1+200");

			{

				if (c1 instanceof Car) {

					System.out.println("c1+300");
				}
			}
		}
	}
}
