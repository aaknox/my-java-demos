package comparingfun;

public class Apple {
	
	int mass;
	String name;
	
	public Apple(int mass, String name) {
		super();
		this.mass = mass;
		this.name = name;
	}
	
	@Override
	public int hashCode() {
	
		return mass;
	}
	@Override
	public boolean equals(Object obj) {
		
		Apple o = (Apple) obj;

		if (this.name == o.name)
			return true;
		else
			return false;
	
	}

}
