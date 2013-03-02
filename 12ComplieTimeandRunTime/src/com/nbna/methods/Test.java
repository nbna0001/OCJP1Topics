package com.nbna.methods;

public class Test {

	public static void main(String args[]) {
		
		//Cal cal = new Cal();		
		//cal.add();
		//cal.multiply();
		
		/*ScCal scal = new ScCal();		
		scal.add();
		scal.multiply();*/
		
		Cal cal = new ScCal();		
		/*
		 * To demo the difference between static and non static methods
		 * during compile and run time.
		 */		
		cal.add();
		cal.multiply();
		
	}

}

/**
* The complier has created a variable cal for Cal class
* But only add run time it took a decission regarding multiply method 
* that it will call the childs class instead of parents class.
* This is an hinderance to overhead. 
* 
*/