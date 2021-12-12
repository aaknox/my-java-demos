package serializefun;

import java.io.Serializable;

public class Hero implements Serializable{
	
	String persona;
	transient String identity;
	String city;
	
	
	public Hero(String persona, String identity, String city) {
		super();
		this.persona = persona;
		this.identity = identity;
		this.city = city;
	}


	@Override
	public String toString() {
		return "Hero [persona=" + persona + ", identity=" + identity + ", city=" + city + "]";
	}

	
	
	
	
}
