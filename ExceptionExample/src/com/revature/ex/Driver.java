package com.revature.ex;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		
		   //the try statement lets you execute a block of code for the sake 
		   //of testing for errors
		try {
			//block of code we want to try
			int[] partyPokemon = {1, 2, 3, 4, 5, 6};
			System.out.println(partyPokemon[8]);
		}
		//The exception we want to catch, in this we catch exception
		catch(Exception e) {
			System.out.println("a party can only have 6 pokemon");
		}
		
		finally {
			System.out.println("The finally statement has run");
			
		}
		
		try (//This is our new scanner for getting user input
				Scanner userObj = new Scanner(System.in)) {
					//This prompts the user for an input
					System.out.println("How many pokemon are in your party?");
					
					int party = userObj.nextInt();
					
					myException.checkPartySize(party);
				}
	}
	
}

