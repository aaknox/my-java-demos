package control;

public class Control {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int x = 10;		
		int y = 50;
		
		
		System.out.println(x++);
		System.out.println(x);
		System.out.println(++x);
		
		if(x>5) {
			System.out.println("this is true");
		}
		
		if(x==15 | y ==50 ) {
			System.out.println("this is true");
		}
		
		int z = 39;
		// short circuiting 
		if(z<100 || z++<1000) {
			System.out.println(z);
			
		}
		

		
		

	}

}
