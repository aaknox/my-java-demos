package com.revature.finallyExamples;

public class WhenFinallyWillNotExecute {

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

}
