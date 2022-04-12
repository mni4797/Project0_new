package com.revature.assignment;

public class Driver {

	public static void main(String[] args) {
		int i = 16;
		
        try {
        	//#4
        	functionThatThrowsException(i);
		
	} catch (TooHighNumberException c) {
		System.out.println(c);
		
	   }
	}
	
        //#3
	public static void functionThatThrowsException(int i) throws TooHighNumberException {
		if (i > 15) {
			
				throw new TooHighNumberException(i);
		
						}
				
		}

				
}
