package singletonfun;

public class Car {

	String name;
	private int gas;
	
	
	public static Car car = null;
	
	private Car(String name, int gas) {
		super();
		this.name = name;
		this.gas = gas;
	}
	
	
	public static Car getCar() {	
		
		if(car==null) {
			car = new Car("Sedan of the people",10);
		}			
		return car;	
	}


	public int getGas() {
		return gas;
	}


	public void setGas(int gas) {
		this.gas = gas;
	}
	
	
	
	
	
	

	
	
	
	

}
