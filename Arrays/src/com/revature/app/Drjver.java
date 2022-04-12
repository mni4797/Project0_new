package com.revature.app;

public class Drjver {

	public static void main(String[] args) {
		int[] listofNumbers = new int[10];
		//arrays are fixed in length
		
		//The below sets the first element to 15
		listofNumbers[0] = 15; 
		
		for (int i = 0; i < listofNumbers.length; i++) {
			listofNumbers[i] = i;
		}
		
		for (int element : listofNumbers) {
			Drjver.doubleValueAndPrint(element);
		}
	}
  public static void doubleValueAndPrint(int value, int multiplier) {
	  System.out.println(value * multiplier);
  }
   //If you use the same method name and return type, but different parameter is method overloading
  //Java understand which method to use by the passing the parameters
  public static void doubleValueAndPrint(int value) {
	  System.out.println(value * 2);
  }
}
