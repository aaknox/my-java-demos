package oop;

public class EncapsulationObject {
	private int number;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		// using encapsulation, we can control the values used to set fields
		if (number > 100) {
			this.number = number;
		}
	}
	
	
}
