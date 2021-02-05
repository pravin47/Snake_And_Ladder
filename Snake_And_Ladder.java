package com.Snake_Ladder;

public class Snake_And_Ladder {

	public static void main(String[] args) {

		final int no_play = 0;
		final int Ladder = 1;
		final int snake = 2;

		int position = 0;
		int no_of_die = 0;

		int die = (int) (Math.floor(Math.random() * 10) % 6) + 1;

		int option = (int) (Math.floor(Math.random() * 10) % 3);
		switch (option) {
		case no_play:
			position = 0;
			break;
		case Ladder:
			position = die;
			break;
		case snake:
			position = -die;
			break;
		}
		System.out.println("Player Position is :" + position);
	}

}

