package com.revature.app;

public class Parent {
	
	private int privateInt = 5;
	
	public int getPrivateInt() {
		return privateInt;
	}
	
	public void setPrivateInt(int value) {
		privateInt = value;
	}
	
	
	protected int protectInt = 6;
	int defaultInt = 2;
	public int publicInt;

}
