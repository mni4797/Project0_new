package hello;

import com.md.datalayer.PokemonTrainerDAO;

public class helloMain {
	
	int x;
	
	//THis is the constructor that creates an instance of the helloMin class
    public helloMain() {
		
		x = 5;
	}

    
	//Created a method that is static with a void return type called myMethod
	static void myMethod() {
		
		System.out.println("My cat is fluffy");
	}
	//Main method
	public static void main (String args[]) {
		
		//Here we are calling our method
	   PokemonTrainerDAO.addTrainer();
	}
	
	
	
}
