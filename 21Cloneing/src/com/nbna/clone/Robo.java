package com.nbna.clone;

public class Robo implements Cloneable{
	
	public int id;
	public int bodyparts;
	
	
	protected Object clone() throws CloneNotSupportedException{
		Robo r =  (Robo) super.clone();
		return r;
	}
		
}
