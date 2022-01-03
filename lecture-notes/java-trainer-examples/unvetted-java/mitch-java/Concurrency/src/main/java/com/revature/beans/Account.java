package com.revature.beans;

public class Account {

	private int balance;
	private int transferCount;

	/**
	 * Transfers funds between two accounts.
	 * Threads
	 * @param b
	 * @param amount
	 */
	public void transfer(Account b, int amount) {
		//Check balance is valid
		if(this.getBalance() < amount) return;
		
		//Reduce account by amount
		this.setBalance(this.getBalance() - amount);
		
		//increase other account balance by amount
		b.setBalance(b.getBalance() + amount);
		
		//Increment transfer count
		this.transferCount++;
	}
	
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getTransferCount() {
		return transferCount;
	}

	public void setTransferCount(int transferCount) {
		this.transferCount = transferCount;
	}

	public Account(int balance) {
		super();
		this.balance = balance;
	}

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	


	@Override
	public String toString() {
		return "Account [balance=" + balance + ", transferCount=" + transferCount + "]";
	}
	
	
}
