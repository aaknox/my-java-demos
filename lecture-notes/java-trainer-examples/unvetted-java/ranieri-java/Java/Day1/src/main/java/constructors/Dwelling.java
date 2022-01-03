package constructors;

public class Dwelling {

	int area ;
	
	public Dwelling() {
		
		System.out.println("Building a dwelling. This is just a cozy place people can live");
		System.out.println("no size was specified so I am just going to build it 100 sq feet");
		this.area = 100;
		
	}
	
	public Dwelling(int area) {
		
		System.out.println("I am building a dwelling of size " + area);
		System.out.println("Built a dwelling. This is just a cozy place people can live");
		
	}
	
}
