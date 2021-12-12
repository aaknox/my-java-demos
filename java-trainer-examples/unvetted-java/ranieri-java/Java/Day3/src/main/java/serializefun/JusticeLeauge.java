package serializefun;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class JusticeLeauge {

	static ObjectOutputStream oos;
	static ObjectInputStream ois;
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Hero batman = new Hero("Batman", "Bruce Wayne", "Gotham");
		performSerialization(batman);
		deSerialize();
		
	}
	
	
	
	public static void performSerialization(Hero e) throws IOException {
		
		oos = new ObjectOutputStream( new FileOutputStream("../Day3/src/main/resources/Hero.txt"));
		oos.writeObject(e);
		oos.close();
		
	}
	
	public static void deSerialize() throws IOException, ClassNotFoundException  {
		
		ois = new ObjectInputStream(new FileInputStream("../Day3/src/main/resources/Hero.txt"));
		Hero hero = (Hero) ois.readObject();	
		System.out.println(hero);
		
		ois.close();
	}
	
}
