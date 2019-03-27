package com.qa.Garage;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Vehicle c1= new Vehicle Audi, 2, 100;

		Car c1 = new Car("Audi", 2, 100, 4, "per");

		Bicycle b1 = new Bicycle("ray", 1, 30, "po");

		Mortorbike m1 = new Mortorbike("yam", 3, 110, "per");

		if (c1 instanceof Car) {

		}
		if (b1 instanceof Bicycle) {

		}

		if (m1 instanceof Mortorbike) {

		}

		ArrayList<Car> carsList = new ArrayList<>();
		ArrayList<Bicycle> bicycleList = new ArrayList<>();
		ArrayList<Mortorbike> mortorbikeList = new ArrayList<>();

		carsList.add(c1);
		bicycleList.add(b1);
		mortorbikeList.add(m1);

		// bicycleList.stream().forEach(System.out::println);

		System.out.println(carsList);
		System.out.println(bicycleList);
		System.out.println(mortorbikeList);

		List<Vehicle> Audis = carsList.stream().filter(p -> (p.getMake().equals("Audi"))).collect(Collectors.toList());
		List<Vehicle> highTopSpeedC = carsList.stream().filter(p -> (p.gettopSpeed() > 99))
				.collect(Collectors.toList());
		List<Vehicle> highTopSpeedMb = mortorbikeList.stream().filter(p -> (p.gettopSpeed() > 99))
				.collect(Collectors.toList());

		ArrayList<Vehicle> highspeedList = new ArrayList<>();

		highspeedList.addAll(highTopSpeedC);
		highspeedList.addAll(highTopSpeedMb);

		List<Integer> SpeedPriceList = highspeedList.stream().map(p -> ((p.gettopSpeed() * 10)))
				.collect(Collectors.toList());

		// System.out.println(SpeedPriceList);

		// System.out.println(Audis);

	}

}
