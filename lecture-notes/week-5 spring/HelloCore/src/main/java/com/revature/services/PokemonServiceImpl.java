package com.revature.services;

import java.util.List;

import com.revature.daos.PokemonDao;
import com.revature.daos.PokemonDaoImpl;
import com.revature.models.Pokemon;

public class PokemonServiceImpl implements PokemonService {

	private PokemonDao pokeDao;
	
	//default constructor for setter injection config to work
	public PokemonServiceImpl() {}
	
	//constructor injection
	public PokemonServiceImpl(PokemonDao pokemonDao) {
		this.pokeDao = pokemonDao;
	}

	//setter injection
	public void setPokeDao(PokemonDao pokeDAO) {
		this.pokeDao = pokeDAO;
	}



	@Override
	public List<Pokemon> getAll() {
		return pokeDao.getAllPokemon();
	}

}
