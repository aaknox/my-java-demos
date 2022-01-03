package designpatterns;

public class Factory {
	/*
	 * In Factory pattern, we create an object without exposing the creation logic 
	 * and use a common interface (the vehicle interface) to refer to object.
	 */
	
	public static Vehicle getVehicle(String vehicleType) {
		if(vehicleType == null) {
			return null;
		}
		else if (vehicleType.equalsIgnoreCase("CAR")) {
			return new Car();
		} else if (vehicleType.equalsIgnoreCase("TRUCK")) {
			return new Truck();
		}
		return null;
	}
	
}
