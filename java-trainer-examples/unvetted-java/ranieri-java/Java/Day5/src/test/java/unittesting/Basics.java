package unittesting;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Basics {
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before the class is run");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("After the class is run");
	}
	

	@Before
	public void before() {
		System.out.println("Before test method");
	}
	
	@After
	public void after() {
		System.out.println("After test method");
	}

	@Test
	public void testSuccess() {
		System.out.println("Will pass so long as no execption is thrown");
	}
	
	@Test
	public void testFail() throws Exception {
		System.out.println("Will fail because an execption is thrown");
		throw new Exception();
	}

}
