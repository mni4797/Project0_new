package service;

import org.apache.log4j.BasicConfigurator;

public class Driver {

private static Bank bank = new Bank();
	
	
	public static void main(String args[]) {
		BasicConfigurator.configure();
		bank.start();
	}
}
