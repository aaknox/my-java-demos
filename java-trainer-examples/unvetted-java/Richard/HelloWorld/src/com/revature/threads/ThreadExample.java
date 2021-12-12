package com.revature.threads;

public class ThreadExample {
	public static void main(String[] args) {
		System.out.println("Hello, this is this main thread.");
		//Thread thread = new MyThread();
		//Thread thread = new Thread(new MyRunnable());
		Runnable r = () -> {
			System.out.println("I'm a thread (lambda runnable)!");
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("Thread is ending.");
		};
		Thread thread = new Thread(r);
		thread.start();
		System.out.println("Started a new thread");
		System.out.println("Is thread alive? "+thread.isAlive());
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Is thread alive? "+thread.isAlive());
		System.out.println("Execution of the main thread is now done.");
	}
}
