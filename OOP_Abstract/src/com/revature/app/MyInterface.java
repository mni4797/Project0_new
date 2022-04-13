package com.revature.app;

public interface MyInterface {
	
	public int i = 0;
	
	public void doSomething();
	
	public default void doMoreThings() {
		System.out.println("Do more things!");
	}
}
