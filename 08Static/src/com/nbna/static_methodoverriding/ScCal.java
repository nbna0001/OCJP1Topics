package com.nbna.static_methodoverriding;

public class ScCal extends Cal{
	
	
	public void add(){
		System.out.println("This is the add method of ScCal");
	}
	/*
	 * To Demo that the static methods of a child class can not be over-ridden
	 * by non static methods
	 */
	
	public static void multiply(){
		System.out.println("This is the multiply method of ScCal");
	}
}
