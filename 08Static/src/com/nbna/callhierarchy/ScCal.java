package com.nbna.callhierarchy;

public class ScCal extends Cal{
	
	static{
		System.out.println("Static of ScCal");
	}

	public ScCal() {
		System.out.println("Const of scCal");
	}
	
	public void add(){
		System.out.println("This is the add method of ScCal");
	}
	/*
	 * To Demo that the static methods of a child class can not be over-ridden
	 * by non static methods
	 */
	/*
	public void multiply(){
		System.out.println("This is the multiply method of ScCal");
	}*/
}
