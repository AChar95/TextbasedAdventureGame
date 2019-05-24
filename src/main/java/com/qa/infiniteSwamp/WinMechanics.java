package com.qa.infiniteSwamp;


import java.util.Scanner;

public class WinMechanics {
	public void findTreasure() {

		FakeTreasure fake = new FakeTreasure();
		Boolean winCondition = true;
		System.out.println(
				"You see two treasure chests before you. The left one's outer body is cleaner, and emits a magically humming sound similar to that of your watch-compass");
		System.out.println("the right one appears plain, and slightly more dirty than the other");
		while (winCondition) {
			String userInput = winInput();
			if (userInput.equalsIgnoreCase("left")) {
				fake.endGameTxt();
				break;
			} else if (userInput.equalsIgnoreCase("right")) {
				WinMechanics win = new WinMechanics();
				win.realChest();
				break;
			} else {
				System.out.println("Please choose either left or right");
			}

		}
	}

	public void realChest() {
		Endgame endgame = new Endgame();
		System.out.println(
				"You lean forward and slowly undo the latch holding the chest shut, the hinges creak as you lift the lid. Inside the contents glisten and light up your eyes");
		System.out.println(
				"The old man was right! You fill your back pack with the treasure, enough to feed the orphans back in your home city or to start your training to become a knight");
		System.out.println("The chest lay there empty, there is bound to be more treasure in the swamp");
		endgame.carryOn();
	}

	public String winInput() {
		Scanner s = new Scanner(System.in);
		String fTInput = s.nextLine();
		return fTInput;
	}
}
