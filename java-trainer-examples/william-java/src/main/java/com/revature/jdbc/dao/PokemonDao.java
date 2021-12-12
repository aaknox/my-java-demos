package com.revature.jdbc.dao;

import java.util.List;

import com.revature.jdbc.model.Pokemon;

public interface PokemonDao {

	public Pokemon getPokemon(String name);
	List<Pokemon> getAllPokemon();
	public boolean insertPokemon(Pokemon pokemon);
	public boolean updatePokemon(Pokemon pokemon);
	boolean deletePokemon(int id);
	
}
