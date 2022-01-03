package com.revature;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringXTest {
	
	/**
	 * @author William Gentry
	 * 
	 * The purpose of these unit tests is to help associates grasp the concept of the differences between String, StringBuilder,
	 * and StringBuffer. The tests rely on static methods derived in the associated StringX class, which simply calculates the difference 
	 * in System.nanoTime() for concatenating the letter 'a' to an empty String, StringBuilder, or StringBuffer for the specified number 
	 * of iterations
	 */

	@Test
	public void stringFasterThanBuilder() {
		assertFalse(StringX.stringFasterThanBuilder(1000));
	}
	
	@Test
	public void stringFasterThanBuffer() {
		assertFalse(StringX.stringFasterThanBuffer(1000));
	}
	
	@Test
	public void builderFasterThanString() {
		assertTrue(StringX.builderFasterThanString(1000));
	}
	
	@Test
	public void builderFasterThanBuffer() {
		assertTrue(StringX.builderFasterThanBuffer(1000));
	}
	
	@Test
	public void bufferFasterThanString() {
		assertTrue(StringX.bufferFasterThanString(1000));
	}
	
	@Test
	public void bufferFasterThanBuilder() {
		assertFalse(StringX.bufferFasterThanBuilder(1000));
	}

}
