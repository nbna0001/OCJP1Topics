package com.nbna.stringmanuplation;

public class UsageofTrim {

	
	public static void main(String[] args) {
		
		/*
		 * To demo how trim function works
		 */
		
		String s = "  Hello";
		String s1= "       this   is   what      ";
		String s2= "trim does";
		String result = s+s1+s2;
		System.out.println(result);
		
		s1 = s1.trim();
		String result1 = s+" "+s1+s2;
		System.out.println(result1);
	}

}
