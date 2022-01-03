package threading;

public class App {
	
	
	
	public static void  main(String[] args) throws InterruptedException {
		
		
		System.out.println(Resource.num);
		

		Process t1 = new Process(1,1000);
		t1.start();
		
		Process t2 = new Process(2,10);
		t2.start();
		System.out.println(t2.isAlive());
		

		t1.join();
		t2.join();
		System.out.println(t2.isAlive());

		
		System.out.println("Finished");
		
		
		
	}

}
