package com.nbna.abstsecond;
/*
 * To Demo that a class needs to be declared abstract if it 
 * has abstract methods
 */

public abstract class Cal {

	public abstract void add();
	
	 void multiply(){
		
		System.out.println("This is multiply method in Abstract Cal");
	}
	
	public static String divide(){
		System.out.println("This is the divde method in Cal");
		return "hi";
	}
	
}
