package com.revature.app;

import java.util.Arrays;

public class Driver {

	public static void main(String[] args) {

       Vehicle a = new Vehicle(),
               b = new Vehicle(),
               c = new Vehicle();

          
        a.make = "Honda";
		a.model = "Accord";
		a.year = "2000";
		
		b.make = "Hyundai";
		b.model = "Elantra";
		b.year = "2011";
		
		c.make = "Ford";
		c.model = "Ranger";
		c.year = "1997";
		
		Vehicle[] vehicles = new Vehicle[] {a, b, c};
		Arrays.sort(vehicles);
		System.out.println(Arrays.toString(vehicles));
		
        
	}

}
