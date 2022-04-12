package com.md.datalayer;

public class PokemonTrainer {
	//these are the attributes for our pokemonTrainer object
	String firstName;
	String lastName;
	int age;
	String typeFavorite;
	int badges;
	
	//this line is adding toString method 
	@Override
	public String toString() {
		return "PokemonTrainer [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", typeFavorite="
				+ typeFavorite + ", badges=" + badges + "]";
	}
	
	
	
}
