package threading;

public class Process extends Thread {
	
	int change;
	int delay;
	
	public Process(int change, int delay) {
		this.change = change;
		this.delay = delay;
		
	}
	
	@Override
	public void run() {

			try {
				Resource.updateNumber(change,delay);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		

			
	}

}
