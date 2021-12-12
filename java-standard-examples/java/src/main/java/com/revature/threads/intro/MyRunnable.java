/**
 * @author Richard Orr
 */

package com.revature.threads.intro;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("I'm a thread (runnable)!");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Thread is ending.");
	}
}
