package reflectionfun;

import java.lang.reflect.Method;

public class Reflect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Method [] smeth = String.class.getMethods();
		
		for(Method m : smeth) {
			System.out.println( m.toGenericString());

		}
		

	}

}
