package com.nbna.simplegarbagecollectorexample;

public class BulkyObject {

	int[] array;
	
	BulkyObject(){
		System.out.println("This is the Constructor of BulkyObject");
		array = new int[1000000];
	}

	protected void finalize(){
		
		System.out.println("This is the finalize method in the BulkyObject");
	}
	
}
