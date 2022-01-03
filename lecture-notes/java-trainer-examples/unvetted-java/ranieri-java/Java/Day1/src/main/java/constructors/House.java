package constructors;

public class House extends Dwelling {
	
	
	//Constructors do not have a return type
	//The new keyword means constructors allocate memory for an object
	//Constructors can be overloaded
	//Constructors cannot be overridden
	
	int walls;

	public static void main(String[] args) {
		House h = new House(1000,8);
	}
	
	
	
	public House() {
		// implicit  no arg super constructor
		System.out.print("I am building a house. You gave me no information so I am just going to build it using defaults");
		
	}
	
//	
//	public House(int area, int walls) {
//		System.out.println("Building a House of area "+ area + " and "+ walls +" walls");
//		super.area = area;
//		this.walls = walls;
//		System.out.println("Built a House of area "+ area + " and "+ walls +" walls");
//		
//	}
	
	public House(int area, int walls) {
		super(area);
		this.walls = walls;
		System.out.println("Built a House of area "+ area + " and "+ walls +" walls");
		
	}
	
	
	
	
	
	

}
