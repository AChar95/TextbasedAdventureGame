package com.qa.infiniteSwamp;

import java.util.Scanner;

public class Endgame {
	Swamp swamp = new Swamp();

	public void restart() {
		Boolean condition = true;
		Movement movement = new Movement();
		System.out.println("Would you like to start again?");
		while (condition) {
			String playerInput = endgameInput();
			if (playerInput.equalsIgnoreCase("yes")) {
				System.out.println("Restarting game...resetting coordinates");
				movement.setXOrigin();
				movement.setYOrigin();
				swamp.start();
				condition = false;
			} else if (playerInput.equalsIgnoreCase("no")) {
				System.out.println("Thank you for playing the game");
				swamp.setEndGame();
				condition = false;
			} else {
				System.out.println("You can only choose 'Yes' or 'No'");
			}
		}

	}

	public void carryOn() {
		System.out.println("Do you want to continue? 'Yes' or 'No'");
		Boolean condition = true;
		while (condition) {
			String playerInput = endgameInput();
			if (playerInput.equalsIgnoreCase("yes")) {
				swamp.startMovement();
				condition = false;
			}
			else if (playerInput.equalsIgnoreCase("no")) {
				System.out.println("Thank you for playing the game");
				swamp.setEndGame();
				condition = false;
			} else {
				System.out.println("You can only choose 'Yes' or 'No'");
			}
		}
	}

	public String endgameInput() {
		Scanner s = new Scanner(System.in);
		String fTInput = s.nextLine();
		return fTInput;
	}
}
