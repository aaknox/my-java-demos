package oop;

public class EncapsulationExample {

	public static void main(String[] args) {
		testSampleObject();
		testEncapsulationObject();
	}
	
	public static void testSampleObject() {
		SampleObject so = new SampleObject();
		// this cannot be done!
		//String test1a = so.iAmPrivate;
		String test1b = so.getiAmPrivate();
		
		String test2a = so.iAmDefault;
		String test2b = so.getiAmDefault();
		
		String test3a = so.iAmPublic;
		String test3b = so.getiAmPublic();
		
		System.out.println(test1b);
		System.out.println(test2a);
		System.out.println(test3b);
	}
	
	public static void testEncapsulationObject() {
		EncapsulationObject eo = new EncapsulationObject();
		eo.setNumber(50); // attempt to set number field
		System.out.println("first attempt: " + eo.getNumber());
		eo.setNumber(200);
		System.out.println("second attempt: " + eo.getNumber());
	}
}
