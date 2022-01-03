package overloadvsoverriding;

public class RebelliousChild extends StrictParent{

	
	@Override
	public int add(int num1, int num2) {
		
		return num1-num2;
		
	}
	
	
}
