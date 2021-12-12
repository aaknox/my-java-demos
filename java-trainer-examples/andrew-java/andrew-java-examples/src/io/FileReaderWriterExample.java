package io;

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

	public static void main(String[] args) {
		try {
			readFromFile();
			writeToFile();
			fr.close();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void readFromFile() throws IOException {
		fr = new FileReader("files/dummydata.txt");
		System.out.println("About to read from file...");
		while ((c = fr.read()) != -1) {
			// must use Character.toChars() method to read the characters from integer value
			System.out.print(Character.toChars(c));
		}
		fr.close();
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

}
