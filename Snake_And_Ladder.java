package com.Snake_Ladder;

public class Snake_And_Ladder {

	public static void main(String[] args) {

		final int no_play = 0;
		final int Ladder = 1;
		final int snake = 2;
		final int Win_position = 100;
		
		int position = 0;
		int no_of_die = 0;

		while(position != Win_position) 
		{
				int die = (int) (Math.floor(Math.random() * 10) % 6) + 1;
		
				int option = (int) (Math.floor(Math.random() * 10) % 3);
				switch (option) 
				{
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
				
						if(position<no_play)
						{
							position = no_play;
						}
						else if(position>Win_position)
						{
							position = position - no_of_die;
						}
		}
		System.out.println("Player Winning Position is :" +position );
	}
}
				
