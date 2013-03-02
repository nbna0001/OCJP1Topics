package com.nbna.variables;

public class Test {

	public static void main(String args[]) {
		//Cal cal = new Cal();
		Cal cal = new ScCal();
		/*
		 * To Demo that variables regarding the decision is made at 
		 * complie time not run time
		 */
		System.out.println("The value of i in cal is: "+ cal.i );		
	}

}
