package com.revature.finallyExamples;

public class InvokingOutOfMemoryError {

	public InvokingOutOfMemoryError() {}

	
	/**
	 * I dont usually walk through the steps of how to create an OutOfMemoryError.... I'll usually just copy/paste it, and use this 
	 * method to show the associates that the finally block will always execute, even with an OutOfMemoryError
	 */
	
	public static void memoryTest() {
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
}
