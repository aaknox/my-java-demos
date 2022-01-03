package com.revature.exceptions;

public class Application {
	
	
	/**
	 * @author William Gentry
	 * 
	 * I use these examples to demonstrate the hierarchy of how exceptions must be caught
	 * from most specific exception => most broad exception
	 * @throws InterruptedException 
	 */

	
	public static void main(String[] args) throws InterruptedException {
		try {
			myRiskyCode();
		} catch (GrandChildException gce) {
			
		} catch (ChildException ce) {
			
		} catch (ParentException pe) {
			
		}
	}
	
	/**
	 * I use this example to highlight the order in which exceptions must be caught
	 */
	public static void myRiskyCode() throws ParentException {
		throw new ParentException();
	}
	
}
