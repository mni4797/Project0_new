package com.revature.app;

public class MyObject {
	
	//Static fields belong to the class and not any instance. 
	//So any change to a static field is reflected by all instances of the class
	static String name = "My Object";
	
	//Any no-static fields will carry data only for each individual instance
	public int number = 0;
	
	public void printName() {
		System.out.println(name + ": " + number);
	}
	
	public void growNumber() {
		
		int multiplier = 2;
		
		if(multiplier > 1) {
			
			int y = multiplier * 2;
			
			number +=y;
		}
	}
	public void testVarArgs(String...args){
		
		for(String s : args) {
			System.out.println(s);
			
	   }
		
	}
	
	public void testArgs(String[] args) {
		
		for(String s : args) {
			System.out.println(s);
		}
	}
 }
