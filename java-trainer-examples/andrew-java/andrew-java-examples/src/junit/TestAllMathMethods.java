package junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestAllMathMethods {

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
		System.out.println("this test should pass...");
		int result = MathOperations.add(1,2);
		assertTrue(result == 3);
	}
	
	@Test
	public void testSubtract() {
		System.out.println("this test should pass...");
		int result = MathOperations.subtract(5, 1);
		assertTrue(result == 4);
	}
	
	@Test(expected=ArithmeticException.class)
	public void testDivideByZero() {
		System.out.println("this test expects an ArithmeticException to be thrown");
		int result = MathOperations.divide(1, 0);
	}

}
