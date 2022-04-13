package com.revature.inheritence;

public class Dog extends Pet{
       
	String color;
	String hairLength;
	
	
	public void treats(String treats, String food) {
		System.out.println("My dog pet likes " + treats + "and" + food);
	}

}
