package com.nbna.constantsexample;
/*
 * To demo alternative approach to use contants
 */
public class MathTest1 {
	
	public static void main(String[] args) {
		int r=5 ;		
		 System.out.println("The circumfurnace of circle with radus 5 is: " + 2*MathConstants.PI*r);
		 System.out.println("The area of circle with radus 5 is: " + MathConstants.PI*r*r);
		

	}

}
