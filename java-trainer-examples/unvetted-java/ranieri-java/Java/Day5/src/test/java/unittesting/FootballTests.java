package unittesting;


import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import football.FootballPlayer;

public class FootballTests {

	@BeforeClass
	public static void makePlayers() {
		
		
		FootballPlayer blunt = new FootballPlayer(1,100);
	}
	
	@Test
	public void canEliPass() {
		FootballPlayer eli = new FootballPlayer(100,10);
		boolean passer = false;
		
		if(eli.arm> 75) 
			passer = true;
		
		assertTrue(passer);
	}
	
	
	@Test
	public void canEliRun() {
		FootballPlayer eli = new FootballPlayer(100,10);
		boolean runner = false;
		
		if(eli.speed> 75) 
			runner = true;
		
		assertTrue(runner);
	}
	

}
