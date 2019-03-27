package com.qa.InfiniteTerrain2;

public class Player {

	private int playerPositionx;
	private int playerPositiony;

	public Player(int positionx, int positiony) {

		this.setplayerPositionx(positionx);

		this.setplayerPositiony(positiony);
	}

	public int getplayerPositionx() {
		return playerPositionx;
	}

	public void setplayerPositionx(int playerPositionx) {
		this.playerPositionx = playerPositionx;
	}

	public int getplayerPositiony() {
		return playerPositiony;
	}

	public void setplayerPositiony(int positiony) {
		this.playerPositiony = positiony;
	}

	// TODO Auto-generated method stub

}
