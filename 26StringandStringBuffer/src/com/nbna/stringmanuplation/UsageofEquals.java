package com.nbna.stringmanuplation;

public class UsageofEquals {

	
	public static void main(String[] args) {
		
		String str1 ="xyz.gif";
		String str2 = new String("xyz.gif");
		/*
		 * 1)To demo that .equals method is overridden in String class
		 * 2)Compares this string to the specified object. The result 
		 *  is true if and only if the argument is not null and is a 
		 *  String object that represents the same sequence of characters as this object. 
		 */
		
		if(str1.equals(str2))
			System.out.println("true");
		else
			System.out.println("false");
		/*
		 * To demo that == compares the reference variables not the values
		 */
		if(str1==str2)
			System.out.println("true");
		else
			System.out.println("false");
		
		/**
		 * Explain intern term to specify that 2 objects will not 
		 * be created
		 */
		//System.out.println("has code of str1: "+ str1.hashCode());
		//System.out.println("has code of str1: "+ str2.hashCode());
		
	}

}
