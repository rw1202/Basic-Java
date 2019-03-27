package com.qa.Blackjack;

public class BlackJack {

	public static int play(int i, int j) {

		if (i < 22 && (j < i || j > i))

			return i;
	

		
		if ((j < 22 && (i < j || i > j)))

			

			return j;
		
		else return 0;
		
	}

}
