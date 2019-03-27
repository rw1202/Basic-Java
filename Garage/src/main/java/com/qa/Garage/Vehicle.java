package com.qa.Garage;

public abstract class Vehicle {
	private String make;
	private int age;
	private int topspeed;;

	public Vehicle(String make, int age, int topSpeed) {

		this.setMake(make);

		this.setAge(age);

		this.settopSpeed(topSpeed);

	}

	public String toString() {
		return getMake() + " " + getAge() + " " + gettopSpeed();
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;

	}

	public void settopSpeed(int topSpeed) {
		this.topspeed = topSpeed;
	}

	public int gettopSpeed() {
		return topspeed;
	}
	
	public String getMake() {
		return make;
	} 
	public void setMake(String make) {
	this.make=make;
	}

	
}

	// TODO Auto-generated method stub

