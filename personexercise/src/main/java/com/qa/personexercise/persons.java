package com.qa.personexercise;

public class persons {

	private String name;
	private int age;
	private String jobTitle;

	public persons(String name, int age, String jobTitle) {

		this.setName(name);

		this.setAge(age);

		this.setjobTitle(jobTitle);
	}

	public String toString() {
		return getName() + " " + getAge() + " " + getjobTitle();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getjobTitle() {
		return jobTitle;
	}

	public void setjobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

}
