package threading;

import java.util.ArrayList;

public class Resource {
	
	static {System.out.println("Resource loaded");}
	
	public static  Integer num = new Integer(0);
	

	
	
	public static synchronized void updateNumber(int change, int delay) throws InterruptedException {
	
		System.out.println(Thread.currentThread().getName()+ " is in the method, changes to "+change);
		
		Thread.sleep(delay);
		num = change;
		System.out.println(num);


	}
	

}
