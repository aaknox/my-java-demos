package scoping;

public class Gator {
	
	
	
	// Static methods or variables do not need an instance of an object to be called
	// They can be called directly from the class itself
	// Make something static if it makes sense to use this method or variable without 
	// an instance of the class existing. 
	
	// keeps track of the total amount of gators out there
	static public int numGators;
	
	// Every gator can have a different number of teeth
	public int numTeeth;
	
	// We do not need a gator to describe one 
	static public void description() {
		
		System.out.println(" A gator is a large reptile that goes chomp");
		
	}
	
	// A gator must exist for an action like eating to make sense
	public void loseTooth() {
	
		
	this.numTeeth = this.numTeeth -1;
	System.out.println("This gator broke a tooth! and only has "+ numTeeth +" now");
	

	}
	
	public static void main(String[] args) {
		
		System.out.println("What is a gator?");
		Gator.description();
		
		System.out.println("How many gators are there? " + Gator.numGators);
		
		Gator albert = new Gator();		
		albert.numTeeth = 70;
		
		Gator allie = new Gator();		
		allie.numTeeth = 60;
		
		allie.loseTooth();
	}
	

}
