/**
 * @author Andrew Crenwelge
 */

package com.revature.junit;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParameterizedMathTest {
	// you can use the @Parameter annotation to inject values instead of the constructor
	// only works with PUBLIC variables
	@Parameter
	public int inputDividend;
	@Parameter(1)
	public int inputDivisor;
	@Parameter(2)
	public int expectedResult;

	@Parameters
	public static Collection<Object[]> primeNumbers() {
		return Arrays.asList(new Object[][] {
	         { 10, 2, 5},
	         { 4, 2, 2},
	         { 100, 10, 10},
	         { 27, 9, 3}
	     });
	}
	
	// this constructor will consume each "test case" from the 2D array
	// either use this way or the @Parameter annotation used above
//	public ParameterizedMathTest(int dividend, int divisor, int expected) {
//		this.inputDividend = dividend;
//		this.inputDivisor = divisor;
//		this.expectedResult = expected;
//	}

	@Test
	public void test() {
		assertEquals(expectedResult, MathOps.divide(inputDividend, inputDivisor));
	}

}
