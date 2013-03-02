package com.nbna.constantsexample;

/*
 * To Demo how to resolve ambiguous
 */

public class MathTest2 implements MathConstants, GeometryConstants{
	
	int a = 10;
	public static void main(String[] args) {
		int r=5 ;		
		System.out.println("The circumfurnace of circle with radus 5 is: " + 2*MathConstants.PI);
		System.out.println("The circumfurnace of circle with radus 5 is: " + 2*GeometryConstants.PI*r);
	}

}
