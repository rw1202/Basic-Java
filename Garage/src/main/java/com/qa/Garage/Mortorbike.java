package com.qa.Garage;

public class Mortorbike extends Vehicle {

	private String typeOfMBTyres;

	public Mortorbike(String make, int age, int topSpeed, String typeOfMBTyres) {
		super(make, age, topSpeed);
		// TODO Auto-generated constructor stub

		this.settypeOfMBTyres(typeOfMBTyres);
	}

	public String toString() {
		return getMake() + " " + getAge() + " " + gettopSpeed() + " " + gettypeOfMBTyres();
	}

	public void settypeOfMBTyres(String typeOfMBTyres) {
		this.typeOfMBTyres = typeOfMBTyres;
	}

	public String gettypeOfMBTyres() {
		return typeOfMBTyres;
	}

}
