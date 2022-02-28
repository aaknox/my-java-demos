package com.revature.tests;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import com.revature.otherjava.Menu;
import com.revature.otherjava.MenuImpl;

/**
 * Topic: Unit Testing
 * - Unit testing is a part of Test-driven development.
 * - TDD is the process of first making a test case before writing your production code.
 * 	- aka make your tests first and then write code that will pass that test
 * - This allows for better sustainability and delivering better code faster!
 * - In Java, our unit testing framework is called JUnit. It allows us to write & run our tests.
 * 
 * - When making a unit test, remember the 3 A's:
 * 	- Arrange = you only have code required to setup that specific test
 * 	- Act = the invocation of the method being tested
 * 	- Assert = check whether the expectations were met
 *[END OF NOTE] 
 **/
public class MenuValidationTest {

	//ARRANGE
	Menu menu;
	
	/**
	 * Topic: JUnit Annotations
	 * - JUnit framework has some built-in annotations that are very helpful in setting up and making our tests.
	 * - Review RevPro for the common list of annotations and study what each do
	 * [END OF NOTE]
	 **/
	@BeforeEach
	void setUp() {
		menu = new MenuImpl();
	}
	
	@Test
	@DisplayName("Double conversion of int value should work")
	void option1_selectionTest() {
		//ACT
		double expectedResult = 12.0;
		//ASSERT
		/**
		 * Topic: Assert Methods
		 * - Assertions just makes sure that the application is meeting what is expected. 
		 * 		- So passing is good; failing means that you will need to refactor your code to pass that test.
		 * [END OF NOTE]
		 **/
		assertEquals(expectedResult, menu.convertToDouble(12));
	}
	
	@Test
	@DisplayName("Int conversion of double value should work")
	void option2_selectionTest() {
		//ACT
		int expectedResult = 50;
		//ASSERT
		assertEquals(expectedResult, menu.convertToInt(50.0));
	}
	
	@Test
	@DisplayName("Object conversion of int value should work and id should be equal to 100")
	void option3_selectionPassTest() {
		//ACT
		boolean expectedResult = true;
		//ASSERT
		assertEquals(expectedResult, menu.convertToObject(100));
	}
	
	@Test
	@DisplayName("Object conversion of int value should work but id shouldn't equal to 100")
	void option3_selectionFailTest() {
		//ACT
		boolean expectedResult = false;
		//ASSERT
		assertEquals(expectedResult, menu.convertToObject(99));
	}
}
