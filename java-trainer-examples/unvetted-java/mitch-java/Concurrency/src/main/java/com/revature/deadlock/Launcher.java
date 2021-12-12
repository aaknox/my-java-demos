package com.revature.deadlock;

import com.revature.beans.Account;

/**
 * Causing deadlock ------------------ Two account objects will be created. Two
 * threads will be created to transfer funds between each account.
 * 
 * In order to prevent WAR/RAW errors, each thread acquires locks for both
 * objects This locking process is handled in
 * {@link #transferHelper(Account, Account)} The first thread is given a head
 * start, and each thread will sleep briefly between iterations to prevent
 * immediate deadlock.
 * 
 * A third thread will monitor the application state and report thread and
 * account state to the console.
 * 
 * Deadlock will be determined when threads are both reported as blocked but the
 * transfer counts have stopped incrementing.
 * 
 * What causes deadlock here? The helper function is used to remove repetitive
 * code, but is actually the culprit. Because it was made to be flexible, it
 * locks in alternative order to fit the order the accounts are passed in. By
 * locking in alternating order, it runs the risk that each thread will receive
 * a lock for the first thread and then both be stuck waiting for the lock for
 * the second thread. This problem should be resolvable by always synchronizing
 * the accounts in the same order.
 *
 * @author Mitch Goshorn
 *
 */
public class Launcher {

	// SLEEP_TIME had the strongest influence on whether deadlock occurred
	// in a given run on my device. 10 caused deadlock to occur within a few 
	// monitor iterations. At 25 deadlock occurred inconsistently.
	// Depending on your device and JVM, you may need to configure these values
	public static final int INITIAL_BALANCE = 1000;
	public static final int TRANSFER_RATE = 1;
	public static final int SLEEP_TIME = 15;
	

	public static void transferHelper(Account a, Account b) {
		for (int i = 0; i * TRANSFER_RATE < INITIAL_BALANCE; i++) {

			// Lock the involved objects and do the transfer
			synchronized (a) {
				synchronized (b) {
					a.transfer(b, TRANSFER_RATE);
				}
			}

			// Delay a bit after each iteration
			try {
				Thread.sleep(SLEEP_TIME);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}



	public static void main(String[] args) {

		// Create two accounts each with a balance
		Account accountA = new Account(INITIAL_BALANCE);
		Account accountB = new Account(INITIAL_BALANCE);
		
		// Create threads
		Thread a = new Thread(new Runnable() {
			@Override
			public void run() {
				transferHelper(accountA, accountB);
//				safeSyncTransferHelper(accountA, accountB);
			}
		});

		Thread b = new Thread(new Runnable() {
			@Override
			public void run() {
				transferHelper(accountB, accountA);
//				safeSyncTransferHelper(accountB, accountA);
			}
		});

		// Monitor thread, monitors the state of other threads
		Thread monitor = new Thread(new Runnable() {

			@Override
			public void run() {
				while (a.isAlive() && b.isAlive()) {
					System.out.printf("Thread A state: %s, Thread B state: %s%n", a.getState(), b.getState());
					System.out.printf("Account A: %s%n", accountA);
					System.out.printf("AccountB: %s%n", accountB);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
				}
				System.out.println("Complete");
				System.out.printf("Account A: %s%n", accountA);
				System.out.printf("AccountB: %s%n", accountB);
			}
		});

		a.setName("a");
		b.setName("b");
		monitor.setName("monitor");

		a.start();

		// Sleep to give the initial thread a head start
		try {
			Thread.sleep(30);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		b.start();
		monitor.start();
	}
	
	
	/**
	 * Made safe by always synchronizing in a consistent order
	 * @param sender
	 * @param recipient
	 */
	public static void safeSyncTransferHelper(Account sender, Account recipient) {

		//Ensure that the two accounts will always lock in a predictable order
		Account a = sender.hashCode() > recipient.hashCode() ? sender : recipient;
		Account b = a.equals(sender) ? recipient : sender;
		
		for (int i = 0; i * TRANSFER_RATE < INITIAL_BALANCE; i++) {
			synchronized (a) {
				synchronized (b) {
					sender.transfer(recipient, TRANSFER_RATE);
				}
			}

			// Delay a bit after each iteration
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
	
}
