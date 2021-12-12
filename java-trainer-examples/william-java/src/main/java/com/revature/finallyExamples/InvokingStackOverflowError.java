package com.revature.finallyExamples;

import com.revature.exceptions.Recursion;

public class InvokingStackOverflowError {

	/**
	 * Example to show that even with a StackOverflowError, the finally block will always execute
	 */
	
	public static void recursionTest() {
		try {
			Recursion.calculate(1000000);
		} finally {
			System.out.println("Finally will always execute, unless there is a call to System.exit() or "
					+ "a catastrophic system failure");
		}
	}
}
