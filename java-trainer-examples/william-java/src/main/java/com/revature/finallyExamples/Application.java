package com.revature.finallyExamples;

public class Application {

	/**
	 * Runner class for all of the examples on when finally will execute
	 *
	 * @param args
	 * @throws InterruptedException
	 */
	
	public static void main(String[] args) throws InterruptedException {
		WhenFinallyWillNotExecute.finallyTest(true);
//		InvokingOutOfMemoryError.memoryTest();
//		InvokingStackOverflowError.recursionTest();
	}

}
