package com.qa.infiniteSwamp;

public class Compass {
	public String nearestTreasure(int xP, int yP) {
		String txt;
		Treasure treasure = new Treasure();
		WinMechanics winMech = new WinMechanics();

		int xT = treasure.getTreasureLocalX();
		int yT = treasure.getTreasureLocalY();
		int yDiff = yP - yT;
		int xDiff = xP - xT;
		float z = (float) Math.sqrt((xDiff * xDiff) + (yDiff * yDiff));
		if (xDiff == 0 && yDiff == 0) {
			winMech.findTreasure();
			txt = "Treasure";
			return txt;
		} else if (xP == 0 && yP == 0) {
			System.out.println("No movement");
			txt = "No movement";
			return txt;
		} else {
			System.out.println("The Watch-compass reads: " + z);
			txt = "movement";
			return txt;
		}
	}
}
