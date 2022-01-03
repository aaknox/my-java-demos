package football;

public class FootballPlayer {
	
	public int arm;
	public int speed;
		
	public FootballPlayer(int arm, int speed) {
		super();
		this.arm = arm;
		this.speed = speed;
	}

	public int run() {
		System.out.println("The player runs the football");
		return speed;
	}
	
	public int pass() {
		System.out.println("The player passes the football");
		return arm;
	}
	

}
