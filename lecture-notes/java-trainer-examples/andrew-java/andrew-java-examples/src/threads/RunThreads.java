package threads;

public class RunThreads {

	public static void main(String[] args) {
		/*
		 * 2 ways of creating threads:
		 *  - implement runnable interface
		 *  - extend thread class
		 */
		Thread t1 = new Thread(new ImplementRunnable()); // pass Runnable class into thread constructor
		t1.start(); // start method calls run method
		Thread t2 = new ExtendThread(); // class that extends Thread created directly
		t2.start();
	}

}
