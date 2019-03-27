package com.qa.InfiniteTerrain2;

import java.util.Random;
import java.util.Scanner;

public class runner {

	double xdistance1;

	double ydistance1;

	static Player Player = new Player(0, 0);

	static treasure treasure = new treasure(0, 0);

	public static void main(String[] args) {

		gameSet();

		gameStart();
		// playerPosition.setpositiony(2);

	}

	private static void gameSet() {
		Random Player1 = new Random();
		int playerPositionx = Player1.nextInt(10);

		Player.setplayerPositionx(playerPositionx);

		System.out.println(Player.getplayerPositionx());

		Random Player2 = new Random();
		int playerPositiony = Player2.nextInt(10);

		Player.setplayerPositiony(playerPositiony);

		Random treasure1 = new Random();
		int treasurePositionx = treasure1.nextInt(10);

		treasure.settreasurePositionx(treasurePositionx);

		Random treasure2 = new Random();
		int treasurePositiony = treasure2.nextInt(10);

		treasure.settreasurePositiony(treasurePositiony);

	}

	double xdistance = (treasure.gettreasurePositionx() - Player.getplayerPositionx());
	double ydistance = (treasure.gettreasurePositiony() - Player.getplayerPositiony());

	private static void gameStart() {

		System.out.println("Grey foggy clouds float oppressively close to you," + "\r\n"
				+ "reflected in the murky grey water which reaches up your shins."
				+ "You have a compass on your wrist but it does not point north." + "\r\n"
				+ " Do you 'Check The Compass'?" + "\r\n" + "Y/N?");

		boolean check = true;

		while (check) {

			Scanner sc1 = new Scanner(System.in);
			String choice = sc1.nextLine();

			if (choice.equals("Y")) {

				System.out.println("The dial reads" + xdistance + ydistance
						+ " What will you do? Follow it? Pick a direction: north, south east or west.");
				check = false;

			}

			else {
				System.out.println("You are confused and waste time. Try 'Y'.");

			}
		}

	}

}