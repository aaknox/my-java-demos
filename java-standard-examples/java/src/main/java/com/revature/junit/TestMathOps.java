/**
 * @author Andrew Crenwelge
 */

package com.revature.junit;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestMathOps {
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Before class");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("After class");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("before");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("after");
	}

	@Test
	public void testAdd() {
		System.out.println("Testing add... this test should pass...");
		int result = MathOps.add(1,2);
		assertTrue(result == 3);
	}
	
	@Test
	public void testSubtract() {
		System.out.println("Testing subtract... this test should pass...");
		int result = MathOps.subtract(5, 1);
		assertTrue(result == 4);
	}
	
	//@Ignore // uncomment this line to skip this test
	@Test(expected=ArithmeticException.class)
	public void testDivideByZero() {
		System.out.println("this test expects an ArithmeticException to be thrown");
		MathOps.divide(1, 0);
	}
}
