package com.revature.app;

public class Parent {

	public String firstName;
	public String lastName;
	
	//Overloading method
	public void saySomething(String n) {
		System.out.println(n);
	}
	
	public void saySomething(String n, int num) {
		System.out.println(n + " " + num);
	}
	
	//Overriding methods
	public void overRide() {
		
		System.out.println("This is from parent class");
	}
}
