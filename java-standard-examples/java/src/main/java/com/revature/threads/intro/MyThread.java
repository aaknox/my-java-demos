/**
 * @author Richard Orr
 */

package com.revature.threads.intro;

public class MyThread extends Thread {
	
	@Override
	public void run() {
		System.out.println("I'm a thread!");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Thread is ending.");
	}
}
