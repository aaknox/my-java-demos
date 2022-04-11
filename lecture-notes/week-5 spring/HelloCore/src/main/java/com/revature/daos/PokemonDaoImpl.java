package com.revature.daos;
import java.util.ArrayList;
import java.util.List;

import com.revature.models.Pokemon;

public class PokemonDaoImpl implements PokemonDao {

	@Override
	public List<Pokemon> getAllPokemon() {
		List<Pokemon> dbPokemon = new ArrayList<>();
		
		dbPokemon.add(new Pokemon(1, "pikachu", "electric", 1500));
		dbPokemon.add(new Pokemon(2, "seel", "water", 900));
		dbPokemon.add(new Pokemon(3, "weedle", "bug", 100));
		dbPokemon.add(new Pokemon(4, "mewtwo", "psychic", 12000));
		dbPokemon.add(new Pokemon(5, "ditto", "ground", 200));
		
		return dbPokemon;
	}

}
