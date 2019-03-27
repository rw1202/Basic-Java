package com.qa.oopdemo;

public class delegate {

	private int techskills;

	private int softSkills;

	private String name;

	public delegate(String name) {

		this.setName(name);
	}

	public void remove() {

		System.out.println("delegate was removed");

	}

	public void changeStream() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
