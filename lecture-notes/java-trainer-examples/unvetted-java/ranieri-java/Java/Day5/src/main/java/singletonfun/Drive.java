package singletonfun;

public class Drive {

	
	
	public static void main(String[] args) {
		
		Car myCar = Car.getCar();
		
		System.out.println(myCar.getGas());
		myCar.setGas(7);
		System.out.println(myCar.getGas());
		
		Car yourCar = Car.getCar();
		
		yourCar.getGas();
		System.out.println(yourCar.getGas());
		
	}
}
