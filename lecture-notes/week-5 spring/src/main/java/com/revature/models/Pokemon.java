package com.revature.models;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Pokemon {
	private int pokeId;
	private String pokemonName;
	private String pokeType;
	private int attackPower;
}
