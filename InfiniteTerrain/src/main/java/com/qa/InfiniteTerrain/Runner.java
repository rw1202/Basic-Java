package com.qa.InfiniteTerrain;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Grey foggy clouds float oppressively close to you,\r\n" + "\r\n"
				+ "reflected in the murky grey water which reaches up your shins."
				+ "You have a compass on your wrist but it does not point north." + "\r\n"
				+ " Do you 'Check Compass'?");

		boolean check = true;

		while (check) {

			Scanner sc1 = new Scanner(System.in);
			String choice = sc1.nextLine();

			if (choice.equals("Check Compass")) {

				System.out.println(
						"The dial reads South (10m) What will you do? Follow it? Pick a direction: 'north', 'south',\"\r\n"
								+ "								+ \" 'east' or 'west'.");
				check = false;
				
					
			}

			else {
				System.out.println("You are confused and waste time. Try 'Check Compass'.");

			}
			
			boolean check2 = true;

			while (check2) {

				Scanner sc1 = new Scanner(System.in);
				String choice2 = sc1.nextLine();

				if (choice2.equals("Check Compass")) {

					System.out.println(
							"The dial reads South (10m) What will you do? Follow it? Pick a direction: 'north', 'south',\"\r\n"
									+ "								+ \" 'east' or 'west'.");
					check2 = false;
					
						
				}

				else {
					System.out.println("You are confused and waste time. Try 'Check Compass'.");

			
			
				}
			
			//
			// method("Check Compass");
			//
			// }
			//
			// }
			//
			// public static String method(String move) {
			//
			// // to move
			//
			// return "";
			//
			// }
			//
			// public void methodWithScanner() {
			//
			// Scanner sc = new Scanner(System.in);
			//
			// method(sc.next());

		}

	}
}
