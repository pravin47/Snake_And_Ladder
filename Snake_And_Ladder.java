package com.Snake_Ladder;

public class SnakeAndLadder {

	public static void main(String[] args) {
		// final declaration
		// Player1 2
		final int no_play = 0;
		final int Ladder = 1;
		final int snake = 2;
		final int Win_position = 100;

		// declaraton
		// player 1
		int position1 = 0;
		int no_of_die1 = 0;
		int win_of_Dice1 = 0;

		// declaraton
		// player 2
		int position2 = 0;
		int no_of_die2 = 0;
		int win_of_Dice2 = 0;

		// winnig position till 100
		while (position1 != Win_position && position2 != Win_position) {
			// checkin Dice player1
			int die1 = (int) (Math.floor(Math.random() * 10) % 6) + 1;
			// checkin Dice player2
			int die2 = (int) (Math.floor(Math.random() * 10) % 6) + 1;

			// checking Different option for player1
			int option1 = (int) (Math.floor(Math.random() * 10) % 3);
			switch (option1) {
			case no_play:
				no_of_die1 = 0;
				break;
			case Ladder:
				no_of_die1 = die1;
				break;
			case snake:
				no_of_die1 = -die1;
				break;
			}
			// checking Different option for player2
			int option2 = (int) (Math.floor(Math.random() * 10) % 3);
			switch (option2) {
			case no_play:
				no_of_die2 = 0;
				break;
			case Ladder:
				no_of_die2 = die2;
				break;
			case snake:
				no_of_die2 = -die2;
				break;
			}

			position1 = position1 + no_of_die1;
			// checking different position for player1
			if (position1 < no_play) {
				position1 = no_play;
			} else if (position1 > Win_position) {
				win_of_Dice1++;
				position1 = position1 - no_of_die1;
			}

			position2 = position2 + no_of_die2;
			// checking different position for player2
			if (position2 < no_play) {
				position2 = no_play;
			} else if (position2 > Win_position) {
				win_of_Dice2++;
				position2 = position2 - no_of_die2;
			}
		}
		System.out.println("Player1 Winning Position is :" + position1);
		System.out.println("Number Of Times Dice Win The Game :" + win_of_Dice1);
		System.out.println("Player2 Winning Position is :" + position2);
		System.out.println("Number Of Times Dice Win The Game :" + win_of_Dice2);
		// checking Player winner
		if (position1 == Win_position) {
			System.out.println("Player1 is win");
		} else {
			System.out.println("Player2 is win");
		}
	}
}
