package com.revature.assignment;

public class TooHighNumberException extends Exception{


	public TooHighNumberException(int i) {
		super("The number " + i + " is too high!");

	}



}

