package com.qa.oopdemo;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		delegate d1 = new delegate("bert");
		delegate d2 = new delegate("jeff");
		delegate d3= new delegate("james");

//		d1.remove();
		d2.remove();
		System.out.println(d1.getName());
		System.out.println(d3.getName());

	}

}
