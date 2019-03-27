package com.qa.InfiniteTerrain2;

public class treasure {

	private int treasurePositionx;
	private int treasurePositiony;

	public treasure(int positionx, int positiony) {

		this.settreasurePositionx(positionx);

		this.settreasurePositiony(positiony);
	}

	public int gettreasurePositionx() {
		return treasurePositionx;
	}

	public void settreasurePositionx(int treasurePositionx) {
		this.treasurePositionx = treasurePositionx;
	}

	public int gettreasurePositiony() {
		return treasurePositiony;
	}

	public void settreasurePositiony(int treasurePositiony) {
		this.treasurePositiony = treasurePositiony;
	}
}
