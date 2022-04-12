package com.md.datalayer;

public class PokemonTrainerDAO {
	
	//created a method using the PokemonTrainer model
	public static PokemonTrainer addTrainer() {
		
		//This line initializes an instance of teh PokemonTrainer model class (object)
		PokemonTrainer pokemonTrainer = new PokemonTrainer();
		
		 pokemonTrainer.firstName = "Mohammad";
		 pokemonTrainer.lastName = "Islam";
		 pokemonTrainer.age = 25;
		 pokemonTrainer.typeFavorite = "Dragon";
		 pokemonTrainer.badges = 15;
		 
		  System.out.println(pokemonTrainer);
		return pokemonTrainer;
		
	} 
}
