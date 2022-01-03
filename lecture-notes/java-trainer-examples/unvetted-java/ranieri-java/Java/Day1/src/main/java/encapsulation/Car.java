package encapsulation;

public class Car {

	public String name;
	private int mpg;
	
	
	public Car(String name, int mpg) {
		super();
		this.name = name;
		setMpg(mpg);
	}


	public int getMpg() {
		return mpg;
	}


	public void setMpg(int mpg) {
		
		this.mpg = mpg;
		
		if(mpg < 0) {
			System.out.println("That is impossible setting mpg to the minimum 10");
			this.mpg = 10;
		}
		
	}
	
	
	
	
	
	
	
}
