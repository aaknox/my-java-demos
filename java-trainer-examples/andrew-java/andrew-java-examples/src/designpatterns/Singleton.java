package designpatterns;

public class Singleton {
	/*
	 * in the singleton design pattern, only one object is ever created
	 * every time the singleton is requested, a reference to the same object is returned
	 */
	
	public static Singleton singletonObj; // the reference to the singleton object

	private Singleton() {
		// private constructor can only be called in this class
	}
	
	public static Singleton getInstance() {
		if (singletonObj == null) {
			// if the singleton reference is currently null, create the object
			singletonObj = new Singleton();
		}
		return singletonObj;
	}

}
