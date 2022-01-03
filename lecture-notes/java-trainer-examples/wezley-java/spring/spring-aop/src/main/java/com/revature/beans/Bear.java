package com.revature.beans;

import org.springframework.stereotype.Component;

@Component
public class Bear {
	
	private static Boolean isWinter = false;
	private Boolean isFull = true;
	private Boolean isAwake = true;
	
	public static Boolean getIsWinter() {
		return isWinter;
	}
	public static void setIsWinter(Boolean isWinter) {
		Bear.isWinter = isWinter;
	}
	public Boolean getIsFull() {
		return isFull;
	}
	public void setIsFull(Boolean isFull) {
		this.isFull = isFull;
	}
	public Boolean getIsAwake() {
		return isAwake;
	}
	public void setIsAwake(Boolean isAwake) {
		this.isAwake = isAwake;
	}
	
	public void wakeUpBear() {
		this.setIsAwake(true);
	}
	
	public void bearSleeps() {
		this.setIsAwake(false);
	}
	
	public void bearHibernates() throws Exception{
		if(!Bear.isWinter) {
			throw new Exception("Bears hibernate in the winter");
		} else {
			System.out.println("zzzzzzzzzzzzzzzzz");
			this.bearSleeps();
		}
	}

}
