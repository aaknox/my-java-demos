package com.revature.fourPillars;

import java.util.ArrayList;
import java.util.List;

public class PokemonTrainer {

	public static void main(String[] args) {
		List<Pokemon> myPokemon = new ArrayList<>();
		myPokemon.add(new Charmander("Charmander"));
		myPokemon.add(new Charmander());
		myPokemon.add(new Magmar("Magmar"));
		myPokemon.add(new Flareon("Eevee's Best Evolution"));
		myPokemon.add(new Charizard("Charizard"));
		
		for (Pokemon p : myPokemon) {
			p.info();
			System.out.println();
		}
	}
}
