package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectIOStreamExample {
	/*
	 * This class uses object input/output streams to write a FootballPlayer object to a file, 
	 * then read it back (deserialize) and print out the player
	 */
	
	static ObjectInputStream ois;
	static ObjectOutputStream oos;
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FootballPlayer peytonManning = new FootballPlayer(1,"Peyton","Manning","Colts","QB",1_000_000);
		serializePlayer(peytonManning);
		FootballPlayer p = deserializePlayer();
		System.out.println("The player is: "+p);
	}
	
	public static void serializePlayer(FootballPlayer p) throws IOException {
		System.out.println("Serializing player object to a file...");
		oos = new ObjectOutputStream(new FileOutputStream("files/playerinfo.txt"));
		oos.writeObject(p);
		oos.close();
		System.out.println("Finished!");
	}
	
	public static FootballPlayer deserializePlayer() throws IOException, ClassNotFoundException {
		System.out.println("Reading player object from file...");
		ois = new ObjectInputStream(new FileInputStream("files/playerinfo.txt"));
		FootballPlayer player = (FootballPlayer) ois.readObject();
		ois.close();
		System.out.println("Finished!");
		return player;
	}
}
