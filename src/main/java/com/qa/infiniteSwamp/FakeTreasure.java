package com.qa.infiniteSwamp;

import java.util.Scanner;

public class FakeTreasure {
	public void endGameTxt() {
		System.out.println(
				"As you lean forward to undo the latch that holds the lid down, the top slowly shifts up revealing a two rows of razor sharp teeth on the top and bottom");
		System.out.println("You see a tongue inside, wet with saliva, it begins to rise, legs appearing from beneath it");
		System.out.println("What do you want to do? Run or fight?");
		FakeTreasure fake =new FakeTreasure();
		String fakeInput = playerInput();
		fake.endGame(fakeInput);
	}
		public void endGame(String fakeInput) {
			Endgame endgame = new Endgame();
			String fakeTxt;
		if (fakeInput.equalsIgnoreCase("run")) {
			System.out.println(
					"You turn to sprint, spinning on your heel, you push off, getting no more that 3 metres from the chest before it manages lunge forward and snap at you");
			System.out.println(
					"you feel warmth spreading from your leg, followed by the cool of the swamp water spreading across your body, you are lying on the floor unable to move");
			System.out.println(
					"it is not sure whether you died from blood loss or from septic shock, I don't think the chest ever brushed its teeth, you made a valient effort");
			System.out.println("getting this far");
			endgame.restart();
			fakeTxt = "Trying to get away but failed";
		} else if (fakeInput.equalsIgnoreCase("fight")) {
			System.out.println("You look at the chest and raise your fists, the chest makes a low grumble, almost like a laughing sound");
			System.out.println("It lunges forward and as you try to punch the chest, its jaws lockdown on your arm, you feel it tear through your flesh.");
			System.out.println("Then it swings its mouth to the side, you are thrown far away");
			System.out.println(
					"it is not sure whether you died from blood loss or from septic shock, I don't think the chest ever brushed its teeth, you made a valient effort");
			endgame.restart();
			fakeTxt = "At least you tried";
		} else {
			System.out.println(
					"You took too long to make up your mind, or you tried to do the impossible and as a result of your stupidity the chest towers over you");
			System.out.println(
					"the top lid opens wide and swallows you whole. I would say you should follow the rules of the story but you're now being slowly");
			System.out.println(
					" digested by the stomach of the chest. The treasure chest groans happily and settles back into its previous state waiting");
			System.out.println("waiting for anymore stupid adventurers");
			endgame.restart();
			fakeTxt = "You stood no chance";
		}
	}
		public String playerInput() {
			Scanner s = new Scanner(System.in);
			String pInput = s.nextLine();
			return pInput;
		}

}
