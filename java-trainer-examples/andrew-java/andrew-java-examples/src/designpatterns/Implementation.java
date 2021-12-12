package designpatterns;

public class Implementation {

	public static void main(String[] args) {
		proveSingletonIsOnlyOneObject();
		testFactoryPattern();
	}
	
	public static void proveSingletonIsOnlyOneObject() {
		// you can't do this - you must use the public method!
		// Singleton s = new Singleton();
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		// check memory address - is it referring to exact same object?
		System.out.println("Are s1 and s2 the same object? "+(s1 == s2)); 
	}
	
	public static void testFactoryPattern() {
		// test out getting a car and driving it
		Vehicle car = Factory.getVehicle("Car");
		car.drive();
		System.out.println("Is the vehicle a car? "+ (car instanceof Car));
		// test out getting a truck and driving it
		Vehicle truck = Factory.getVehicle("truck");
		truck.drive();
		System.out.println("Is the vehicle a truck? "+ (truck instanceof Truck));
	}

}
