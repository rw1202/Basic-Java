package com.qa.Garage;

public class Car extends Vehicle {
	private int numberOfPassengers;
	private String typeOfCarTyres;

	public Car(String make, int age, int topSpeed, int noOfPass, String typeOfCarTyres) {
		super(make, age, topSpeed);

		this.setnumberofPassengers(noOfPass);
		this.settypeOfCarTyres(typeOfCarTyres);
	}

	public String toString() {
		return getMake() + " " + getAge() + " " + gettopSpeed() + " " + getnumberOfPassengers() + " "
				+ gettypeOfCarTyres() + " " + getnumberOfPassengers();
	}

	public void settypeOfCarTyres(String typeOfCarTyres) {
		this.typeOfCarTyres = typeOfCarTyres;
	}

	public String gettypeOfCarTyres() {
		return typeOfCarTyres;
	}

	public void setnumberofPassengers(int noOfPass) {

		this.numberOfPassengers = noOfPass;
	}

	public int getnumberOfPassengers() {
		return numberOfPassengers;

	}

}
