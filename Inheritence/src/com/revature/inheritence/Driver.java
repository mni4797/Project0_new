package com.revature.inheritence;

public class Driver {

	public static void main(String[] args) {
		Dog beagle = new Dog();
		
		beagle.size = "small";
		beagle.sound = "bark bark";
		beagle.hairLength = "short";
		beagle.color = "brown";
		
		System.out.println("The dog color is " + beagle.color + " and " + beagle.size);
		
		beagle.sleep();
		
		beagle.treats("beggen strips", "kibble");
		beagle.treats("kibble");

	}

}
