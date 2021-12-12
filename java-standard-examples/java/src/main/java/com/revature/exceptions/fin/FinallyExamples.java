/**
 * @author William Gentry
 */

package com.revature.exceptions.fin;

public class FinallyExamples {

	/**
	 * Runner class for all of the examples on when finally will execute
	 *
	 * @param args
	 * @throws InterruptedException
	 */
	
	public static void main(String[] args) throws InterruptedException {
		outOfMemoryTest();
//		stackOverflowTest();
//		finallyTest(true);
	}
	
	/**
	 * The purpose of this example is to illustrate that the only time a finally block will not execute is when 
	 * there is a call to System.exit() (Or, some catastrophic system failure)
	 * 
	 * @param isSystemExitCalled
	 */
	
	public static void finallyTest(boolean isSystemExitCalled) {
		System.out.println("Hey! We just called finallyTest");
		try {
			System.out.println("Now, we are inside the try-block");
			System.out.println("Was System.exit() called? " + isSystemExitCalled);
			if (isSystemExitCalled) {
				System.exit(0);
			}
		} finally {
			System.out.println("Finally will always execute, unless there is a call to System.exit() or "
					+ "a catastrophic system failure");
		}
	}
	
	/**
	 * I dont usually walk through the steps of how to create an OutOfMemoryError.... I'll usually just copy/paste it, and use this 
	 * method to show the associates that the finally block will always execute, even with an OutOfMemoryError
	 */
	
	public static void outOfMemoryTest() {
		try {
			int iteratorValue = 20;
			System.out.println("======================> OutOfMemoryError Test started");
			for (int outer = 1; outer < iteratorValue; outer++) {
				System.out.println("Iteration " + outer + " => Free Memory: " + Runtime.getRuntime().freeMemory());
				int loop1 = 2;
				int[] memoryFillIntVar = new int[iteratorValue];
				do {
					memoryFillIntVar[loop1] = 0;
					loop1--;
				} while (loop1 > 0);
				iteratorValue = iteratorValue * 5;
				System.out.println("\nRequired memory for the next loop: " + iteratorValue);
				Thread.sleep(1000);
			}
		} catch (InterruptedException ie) {
			
		} finally {
			System.out.println("===================================================");
			System.out.println("Even with an OutOfMemoryError, finally will execute");
			System.out.println("===================================================");
		}
	}
	
	/**
	 * Example to show that even with a StackOverflowError, the finally block will always execute
	 */
	
	public static void stackOverflowTest() {
		try {
			recursion(1000000);
		} finally {
			System.out.println("Finally will always execute, unless there is a call to System.exit() or "
					+ "a catastrophic system failure");
		}
	}
	
	public static int recursion(int initialValue) {
		return initialValue * recursion(initialValue--);
	}

}
