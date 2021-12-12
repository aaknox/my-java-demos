package comparingfun;

public class Judge {
	
	
	public static void main(String[] args) {
		
		Orange o1 = new Orange(25,"Orange 2");
		Apple a1 = new Apple(20, "Apple 1");
		
		
		Orange o2 = new Orange(20,"Orange 1");
		Apple a2 = new Apple(35, "Apple 1");
		
		System.out.println(o1.equals(o2));
		System.out.println(a1.hashCode()==o2.hashCode());
		
		
	}

}
