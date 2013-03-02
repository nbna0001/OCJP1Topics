package com.nbna.stringmanuplation;

public class UsageofSubstring {

	public static void main(String[] args) {

		/*
		 * Returns a new string that is a substring of this string. The
		 * substring begins at the specified beginIndex and extends to the
		 * character at index endIndex - 1. Thus the length of the substring is
		 * endIndex-beginIndex.
		 */
		
		String s = "hamburger".substring(4, 9);
		String s1= "smiles".substring(1, 5);
		String s2= "smiles".substring(1, 2);

		System.out.println("The value of s: "+ s);
		System.out.println("The value of s1: "+ s1);
		System.out.println("The value of s1: "+ s2);
	}

}
