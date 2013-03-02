package com.nbna.shallow;

public class Robo implements Cloneable{
	
	int id;
	int bodyparts;
	Brain brain; 
	
	protected Object clone() throws CloneNotSupportedException{
		Robo r =  (Robo) super.clone();
		return r;
	}
		
}
