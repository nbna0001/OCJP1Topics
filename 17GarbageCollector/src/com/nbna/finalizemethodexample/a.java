package com.nbna.finalizemethodexample;

public class a {

	b b1;
	a(){
		b1= new b();
	}

	/*
	 * This is a special method that gets  called when ever GC gets invoked
	 * here is our change to clean up references which we are not using
	 * and avoid circularreference
	 */
	public void finalize(){
	b1 = null;	
	}
	
}
