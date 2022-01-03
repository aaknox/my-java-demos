package comparingfun;

public class Orange {
	
	int mass;
	String name;
	
	public Orange(int mass, String name) {
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
		
		Orange o = (Orange) obj;

		if (this.name == o.name)
			return true;
		else
			return false;
	
	}

	
}
