package overloadvsoverriding;

public class StrictParent {

	
	public static void main(String[] args) {
		
		StrictParent p = new StrictParent();
		
		System.out.println(p.add(100, 200));
		
		RebelliousChild r = new RebelliousChild();
		
		System.out.println(r.add(100, 200));
		
		StrictParent r2 = new RebelliousChild();
		
		System.out.println(r2.add(100, 200));
		
	}
	
	public  int add(int num1, int num2) {
		
		return num1+num2;
		
	}
	
	public  int add(int num1, int num2,int num3) {
		
		return num1+num2+num3;
		
	}
	
	
	public  double add(int num1, int num2,int num3, int num4) {
		
		return num1+num2+num3+num4;
		
	}
	
}
