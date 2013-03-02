package com.nbna.stringmanuplation;

public class UsingEndsWith {

	public static void main(String[] args) {
		String filename = "xyz.gif";
		boolean b = filename.endsWith("gif");
		
		if(b)		
		System.out.println("The "+ filename + " ends with gif");
		else
		System.out.println("The "+ filename+ "does not end with gif");

	}

}
