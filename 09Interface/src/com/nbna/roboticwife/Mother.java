package com.nbna.roboticwife;

public interface Mother {

	void teachManners();	
	String cookFood();	
	/*
	 * 	To Demo the effect of change in contract.
	 * A common scenario for mothers to cook what ever
	 * kids want similarly Humanoid is forced to implement
	 * new cookFood method
	 */
	//String cookFood(String whateverkidasks);
}
