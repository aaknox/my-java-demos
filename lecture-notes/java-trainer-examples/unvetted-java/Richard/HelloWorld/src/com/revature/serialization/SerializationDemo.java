package com.revature.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import com.revature.beans.Frankenstein;

public class SerializationDemo {
	public static void main(String[] args) {
		Frankenstein f = new Frankenstein(50, "frankie");
		save(f, "frank.dat");
		System.out.println(read("frank.dat"));
	}

	private static void save(Serializable s, String filename) {
		try(FileOutputStream fileout = new FileOutputStream(filename);
				ObjectOutputStream out = new ObjectOutputStream(fileout);) {
			out.writeObject(s);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	private static Serializable read(String filename) {
		Serializable s = null;
		try(FileInputStream filein = new FileInputStream(filename);
				ObjectInputStream in = new ObjectInputStream(filein);) {
			s = (Serializable) in.readObject();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return s;
	}
}
