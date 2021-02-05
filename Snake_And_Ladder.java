package com.Snake_Ladder;

public class Snake_And_Ladder {

	public static void main(String[] args) {
		// final declaration
		final int no_play = 0;
		final int Ladder = 1;
		final int snake = 2;
		final int Win_position = 100;
		// declaraton
		int position = 0;
		int no_of_die = 0;
		int no_of_Dice = 0;
		// winnig position till 100
		while (position != Win_position) {
			// checkin Dice
			int die = (int) (Math.floor(Math.random() * 10) % 6) + 1;
			// checking Different option
			int option = (int) (Math.floor(Math.random() * 10) % 3);
			switch (option) {
			case no_play:
				no_of_die = 0;
				break;
			case Ladder:
				no_of_die = die;
				break;
			case snake:
				no_of_die = -die;
				break;
			}

			position = position + no_of_die;
			// checking different position
			if (position < no_play) {
				position = no_play;
			} else if (position > Win_position) {
				no_of_Dice++;
				position = position - no_of_die;
			}
		}
		System.out.println("Player Winning Position is :" + position);
		System.out.println("Number Of Times Dice Win The Game :" + no_of_Dice);
	}
}
