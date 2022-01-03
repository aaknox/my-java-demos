package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedRWExample {
	/*
	 * this class will read data from a file and write it to another
	 * file using BufferedReader and BufferedWriter classes
	 */
	public static BufferedReader br;
	public static BufferedWriter bw;

	public static void main(String[] args) throws IOException {
		br = new BufferedReader(new FileReader("files/dummydata.txt"));
		bw = new BufferedWriter(new FileWriter("files/bufferedOut.txt"));
		String s;
		System.out.println("About to copy the file...");
		while ((s = br.readLine()) != null) {
			bw.write(s);
			bw.newLine(); // use this to create new line
		}
		System.out.println("Finished!");
		br.close();
		bw.close();
	}

}
