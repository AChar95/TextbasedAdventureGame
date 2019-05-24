package com.qa.infiniteSwamp;

import java.util.Scanner;

public class Swamp {

	public static void main(String[] args) {
		Swamp swamp = new Swamp();
		swamp.start();

	}

	private Boolean adventure = true;
	
	

	public void start() {
		System.out.println(
				"You have arrived in a swamp, a bleak grey kind with very little in the way of features. It was flat, most definitely flat.");
		System.out.println(
				"The sky is obscured by the thick fog the rises from the shallow water you are standing in, you cannot use the sun to guide you as explorers of days gone would have done, you let out a sigh.");
		System.out.println(
				"if you were honest with yourself, you would know that your city life has not prepared you for this, know your boots, which the shop keeper had assured you were waterproof,");
		System.out.println("are already dark from the stagnant water.");
		System.out.println(
				"But your heart is filled with a strong sense of determination, and longing for adventure, that was why you were here after all. The elderly patron at Black Swallow had only planted the seeds");
		System.out.println(
				"he had also given you the compass. What kind and helpful old man, with one leg, and one and half an arms, he was.");
		System.out.println(
				"It was also strange that he had also imparted something on you, he had said that there was great treasure to be found here, in the Infinite Swamp");
		System.out.println(
				"You look at the compass, it hums with magic, and will indicate the direction of the nearest item of treasure, currently it is spinning like a ballerina.");
		System.out.println("You need to decide where you want to take your first steps: north, south, east or west:");
		Swamp swamp = new Swamp();
		swamp.startMovement();
	}

	public void startMovement() {
		Movement movement = new Movement();
		Compass compass;
		while (adventure) {
			compass= new Compass();
			String input = directInput();
			if (input.equalsIgnoreCase("north") || input.equalsIgnoreCase("forward")) {
				movement.goNorth();
				compass.nearestTreasure(movement.curLocalX(), movement.curLocalY());
			} else if (input.equalsIgnoreCase("east") || input.equalsIgnoreCase("right")) {
				movement.goEast();
				compass.nearestTreasure(movement.curLocalX(), movement.curLocalY());
			} else if (input.equalsIgnoreCase("west") || input.equalsIgnoreCase("left")) {
				movement.goWest();
				compass.nearestTreasure(movement.curLocalX(), movement.curLocalY());
			} else if (input.equalsIgnoreCase("south") || input.equalsIgnoreCase("backwards")) {
				movement.goSouth();
				compass.nearestTreasure(movement.curLocalX(), movement.curLocalY());
			} else {
				System.out.println("You can't go in that direction! P.S. you can't fly either");
			}
		}
	}

	public Boolean setEndGame() {
		return adventure = false;
	}

	public String directInput() {
		Scanner s = new Scanner(System.in);
		String dInput = s.nextLine();
		return dInput;
	}
}
