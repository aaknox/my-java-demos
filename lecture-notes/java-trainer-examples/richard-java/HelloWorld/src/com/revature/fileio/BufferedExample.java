package com.revature.fileio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedExample {
	public static void main(String[] args) {
		String filename = "samplefile.txt";
		
		writeBufferedStream(filename, "Hello, I am a buffered stream.\n");
		readBufferedStream(filename);
	}

	private static void readBufferedStream(String filename) {
		try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
			String line = "";
			while((line=reader.readLine())!=null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e ) {
			e.printStackTrace();
		}
	}

	private static void writeBufferedStream(String filename, String message) {
		
		try(BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true));) {
			writer.write(message);
			writer.newLine();
			writer.write(message);
			writer.flush();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}
