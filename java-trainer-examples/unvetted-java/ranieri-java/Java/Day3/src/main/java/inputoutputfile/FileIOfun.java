package inputoutputfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class FileIOfun {
	
	
	public static FileInputStream fis;
	static FileOutputStream fos;
	static ArrayList<Integer> fileData = new ArrayList<Integer>();
	
	public static void main(String[] args) throws IOException {
		
		fis = new FileInputStream("../Day3/src/main/resources/simpsons.jpg");
		readImage(fis);
		
		
		fos = new FileOutputStream("../Day3/src/main/resources/simpsons_copy.jpg");
		copyImage(fos);
		fos = new FileOutputStream("../Day3/src/main/resources/simpsons_corrupt.jpg");
		corruptImage();
	
		
	}
	
	public static void readImage(FileInputStream file) throws IOException {
		
		System.out.println("Reading file information");
		fis = file;
		int i = 0;
		
		while (( i = fis.read())!=-1) {
			fileData.add(i);
		}
		System.out.println("Finished reading \n file is"+fileData.size()+"bytes in size");
		fis.close();
		
	}
	
	public static void copyImage(FileOutputStream file) throws IOException {
		System.out.println("Writing file");
		fos = file;
		int i = 0;
		
		for(i =0;i<fileData.size();i++) {
			fos.write(fileData.get(i));
		}
		System.out.println("Finsished Writing");
		fos.close();
		
	}
	
	public static void corruptImage() throws IOException {
		
		System.out.println("Corrupting image mwuhahahah");
		
		for(int i = 0; i<fileData.size();i++) {

		if (i < fileData.size()/4)
			fos.write(fileData.get(i));
			
		else {
			fos.write(fileData.get(i)+1);
			fileData.set(fileData.get(i) +1, i);
		}		
		}
		
		System.out.println("Corruption complete >:]");
		
	}
	
	

}
