package com.revature.daos;

import java.util.ArrayList;
import java.util.List;

import com.revature.models.Pokemon;

public class PokemonDaoImpl implements PokemonDao {

	@Override
	public List<Pokemon> getAllPokemon(Pokemon pokemon) {
		List<Pokemon> dbPokemon = new ArrayList<Pokemon>();
		
		dbPokemon.add(new Pokemon(1, "pikachu", "electric", 150));
		return null;
	}

}
