package com.revature;

import static org.junit.Assert.assertEquals;

import org.junit.Test;



public class StaticExampleTest {

	StaticExample e1 = new StaticExample();
	StaticExample e2 = new StaticExample();
	StaticExample e3 = new StaticExample();
	StaticExample e4 = new StaticExample();
	

	@Test
	public void Atest() {
		for(int i = 0; i < 5; i++) {
			e1.increment();
		}
		assertEquals(e1.getMyInstanceInt(), 5);
		assertEquals(e1.getMyStaticInt(), 5);
	}
	
	@Test
	public void Btest() {
		for (int i = 0; i < 3; i++) {
			e2.increment();
		}
		assertEquals(e2.getMyInstanceInt(), 3);
		assertEquals(e2.getMyStaticInt(), 8);
	}
	
	@Test
	public void Ctest() {
		for (int i = 0; i < 10; i++) {
			e3.increment();
		}
		assertEquals(e3.getMyInstanceInt(), 10);
		assertEquals(e3.getMyStaticInt(), 18);
	}
	
	@Test
	public void Dtest() {
		for (int i = 0; i < 15; i++) {
			e4.increment();
		}
		assertEquals(e4.getMyInstanceInt(), 15);
		assertEquals(e4.getMyStaticInt(), 33);
	}

}
