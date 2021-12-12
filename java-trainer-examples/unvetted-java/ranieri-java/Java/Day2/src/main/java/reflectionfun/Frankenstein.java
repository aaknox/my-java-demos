package reflectionfun;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Frankenstein {
	
	Method woof;
	Method meow;
	Field nose;
	Field tail;
	
	
	public Frankenstein() {
		
		try {
			this.woof = Dog.class.getMethod("bark", null);
			this.meow = Cat.class.getMethod("meow", null);
			this.nose = Dog.class.getDeclaredField("snout");
			this.tail = Cat.class.getDeclaredField("tail");
		}catch(Exception e) {
			e.printStackTrace();
			
		}
	}
	
	
	
	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		Frankenstein catdog = new Frankenstein();
		
		catdog.woof.invoke(null, null);
		catdog.meow.invoke(null, null);
		
		System.out.println(catdog);
		
		
	
		
	}



	@Override
	public String toString() {
		return "Frankenstein [woof=" + woof + ", meow=" + meow + ", nose=" + nose + ", tail=" + tail + "]";
	}
	
	

	

}
