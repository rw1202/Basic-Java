package com.qa.Garage;

public class Bicycle extends Vehicle {

	private String typeOfBcTyres;

	public Bicycle(String make, int age, int topSpeed, String typeOfBcTyres) {
		super(make, age, topSpeed);
		// TODO Auto-generated constructor stub
		this.settypeOfBcTyres(typeOfBcTyres);
	}

	public String toString() {
		return getMake() + " " + getAge() + " " + gettopSpeed() + " " + gettypeOfBcTyres();
	}

	public void settypeOfBcTyres(String typeOfBcTyres) {
		this.typeOfBcTyres = typeOfBcTyres;
	}

	public String gettypeOfBcTyres() {
		return typeOfBcTyres;
	}

}
