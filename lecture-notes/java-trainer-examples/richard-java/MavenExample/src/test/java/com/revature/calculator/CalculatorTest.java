package com.revature.calculator;

import static org.junit.Assert.assertEquals;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {
	private static Logger log = Logger.getLogger(CalculatorTest.class);
	private static Calculator<Long> longCalc;
	
	@BeforeClass
	public static void methodCalledBeforeAllTests() {
		log.trace("Welcome to JUnit");
	}
	
	@Before
	public void setupCalculator() {
		log.trace("test set up");
		longCalc = new Calculator<Long>();
	}
	
	@Test
	public void multiplicationOfZeroReturnsZero() {
		log.trace("test: mult of zero returns zero");
		//Calculator<Long> longCalc = new Calculator<Long>();
		for(int i = 0; i < 100; i++) {
			assertEquals("0*"+i+" returns 0", new Long(0), longCalc.mult(0l, new Long(i)));
		}
	}
	
	@Test
	public void divisionByZeroReturnsMaxLong() {
		log.trace("test: div by zero returns max long");
		//Calculator<Long> longCalc = new Calculator<Long>();
		for(int i = 0; i<100; i++) {
			assertEquals(i+"/0 returns MAX LONG", new Long(Long.MAX_VALUE), longCalc.div(new Long(i), 0l));
		}
	}
	
	@Test(expected=IllegalArgumentException.class )
	public void illegalArgumentException() {
		log.trace("test3");
		longCalc.test();
	}
}
