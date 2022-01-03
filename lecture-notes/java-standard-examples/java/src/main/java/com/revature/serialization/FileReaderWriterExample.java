/**
 * @author Andrew Crenwelge
 */

package com.revature.serialization;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterExample {
	/*
	 * this class demonstrates a simple FileReader / FileWriter use
	 */
	static FileReader fr;
	static FileWriter fw;
	static int c;

	public static void main(String[] args) throws IOException {
		try {
			readFromFile();
			writeToFile();
			// don't forget to close your streams after you're done!
			fr.close();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		FileReaderWriterExample frwe = new FileReaderWriterExample();
		frwe.useTryWithResources();
	}
	
	public static void readFromFile() throws IOException {
		fr = new FileReader("files/dummydata.txt");
		System.out.println("About to read from file...");
		while ((c = fr.read()) != -1) {
			// must use Character.toChars() method to read the characters from integer value
			System.out.print(Character.toChars(c));
		}
		System.out.println("\nFinished reading from file");
	}
	
	public static void writeToFile() throws IOException {
		fw = new FileWriter("files/outputfile.txt");
		String[] writeMe = {
				"this should be the output",
				"this should be on the second line",
				"third line!!"
				};
		System.out.println("\nWriting to file...");
		for (int i=0;i<3;i++) {
			fw.write(writeMe[i]);
			fw.write("\n");
		}
		System.out.println("Completed!");
	}
	
	public void useTryWithResources() throws IOException {
		System.out.println("\nStarting try-with-resources block...");
		// using try-with-resource automatically closes the resource in the ()
		try(FileWriter fw = new FileWriter("files/otheroutput.txt")) {
			for (int i=0;i<10;i++) {
				fw.write("This is line " + i + " \n");
			}
			// no need for fw.close() here!!
		}
		System.out.println("Finished!");
	}

}
