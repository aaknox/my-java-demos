package oop;

public class SpecificObject extends GenericObject {
	/*
	 * This class shows:
	 *  - how child classes inherit from parent classes,
	 *  - constructor chaining
	 *  - method overriding
	 */
	
	int number;
	
	public static void main(String[] args) {
		System.out.println("Starting main method");
		SpecificObject o1 = new SpecificObject();
		SpecificObject o2 = new SpecificObject(1);
		// using polymorphism here, we see that even though the type of the object is GenericObject,
		// the method that is called is still the overridden child method of SpecificObject.
		GenericObject go = new SpecificObject();
		go.doSomething();
	}
	
	@Override // this method overrides the doSomething method of GenericObject
	public void doSomething() {
		System.out.println("Doing a specific thing...");
	}

	public SpecificObject() {
		// calling parent class constructor implicitly here
		System.out.println("No-arg specific object constructor");
	}
	
	public SpecificObject(int number) {
		// calling parent class constructor explicitly
		super("hello world");
		this.number = number;
		System.out.println("1-arg specific object constructor");
	}

}
