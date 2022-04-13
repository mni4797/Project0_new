package com.revature.app;

public class Driver {

	public static void main(String[] args) {
		
		//Using Child class
		Child c = new Child();
		
		c.name = "Salman";
		c.school = "1st Grade";
		
		System.out.println(c.name + " studies in " + c.school );
		
        //Calling overloading method
		Parent p = new Parent();
		
		p.saySomething("This is overloading!!");
		p.saySomething("This is overloading" + " " + 2);
		
		//Calling overriding method
	      overRide();
		//p.overRide();
		
		
	}

	private static void overRide() {
		// TODO Auto-generated method stub
		
	}

}
