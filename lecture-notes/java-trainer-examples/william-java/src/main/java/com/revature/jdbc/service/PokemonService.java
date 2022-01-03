package com.revature.jdbc.service;

import java.util.List;

import com.revature.jdbc.dao.PokemonDao;
import com.revature.jdbc.dao.PokemonDaoImpl;
import com.revature.jdbc.model.Pokemon;

public class PokemonService {

	private static PokemonDao dao = new PokemonDaoImpl();
	
	private PokemonService() {}
	
	public static Pokemon getPokemon(String name) {
		return dao.getPokemon(name);
	}
 	
	public static List<Pokemon> getAllPokemon() {
		return dao.getAllPokemon();
	}
	
	public static boolean insertPokemon(Pokemon pokemon) {
		return dao.insertPokemon(pokemon);
	}
	
	public static boolean updatePokemon(Pokemon pokemon) {
		return dao.updatePokemon(pokemon);
	}
	
	public static boolean deletePokemon(int id) {
		return dao.deletePokemon(id);
	}
}
