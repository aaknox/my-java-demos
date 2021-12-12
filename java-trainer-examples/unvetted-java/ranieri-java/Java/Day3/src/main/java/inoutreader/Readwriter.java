package inoutreader;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Readwriter {
	


	
	
	
	public static void main(String[] args) throws IOException {
		
		read();
		write();
		
	}
	
	
	
	public static void write() throws IOException {
		
		BufferedWriter writer = new BufferedWriter( new FileWriter("../Day3/src/main/resources/Response.txt",true));	
		writer.write("I am doing well");
		writer.close();
		
	}
	
	public static void read() throws IOException {
		BufferedReader reader = new BufferedReader( new FileReader("../Day3/src/main/resources/Greeting.txt"));
		
		while(true) {
			
			String s = reader.readLine();
			
			if(s == null) {
				reader.close();
				break;
			}
						
			
			System.out.println(s);
	
		}
		
		
	}

}
