package com.nbna.convertingfromonetoother;

public class PrimitivetoStringExample {

	
	public static void main(String[] args) {
		/*
		 * To Converting Primitive to String
		 */
		int val =10;		
		System.out.println("val: "+ val);
		//or
		String valstring = val+"";				
		//or
		String valstring1 = String.valueOf(val);
		
		System.out.println("val: "+val+ " valstring :" +valstring+ " valstring1 :" + valstring1);
	}

}
