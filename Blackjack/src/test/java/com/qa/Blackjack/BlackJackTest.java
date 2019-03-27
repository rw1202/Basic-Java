package com.qa.Blackjack;



import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class BlackJackTest {

	@Test
	public void withintest() {
		
	BlackJack blackJack = new BlackJack();
		
	Assert.assertEquals(10, BlackJack.play(10, 22));
	
	
	}
	
	@Test
	public void veryhightest() {
		assertEquals(0, BlackJack.play(23, 22));

	}
	
	
	@Test
	public void wintest() {
		assertEquals(21, BlackJack.play(19, 21));
	}
	


		
	

	
		// TODO Auto-generated method stub
		
	}

